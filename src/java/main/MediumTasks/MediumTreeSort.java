package main.MediumTasks;

import main.Task;

import java.security.KeyStore;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MediumTreeSort implements Task {
    private Map<String, ArrayList<String>> treeMap;
    private MyTreeComparator comparator;


    public MediumTreeSort(String string) {
        comparator = new MyTreeComparator();
        treeMap = new TreeMap();
        for(String str: string.split(" ")){
            addElement(str);
        }
    }

    private void addElement(String element){
        if (element.length() == 0) {
            throw new RuntimeException("Can't add empty string!");
        } else {
            String key = Character.toString(element.charAt(0));
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, new ArrayList());
            }
            treeMap.get(key).add(element);
        }
    }

    @Override
    public void runTask() {
        for(var entry :treeMap.entrySet()){
            ArrayList<String> list = entry.getValue();
            Collections.sort(list, comparator);
        }
    }

    @Override
    public String printResult() {
        return treeMap.toString();
    }

    class MyTreeComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            if (o1.equals(o2)){
                return 0;
            } else if (o1 == null) {
                return -1;
            } else if (o2 == null) {
                return 1;
            } else {
                int equal = Character.compare(o1.charAt(0), o2.charAt(0));
                if (equal == 0) {
                    int len = o2.length() - o1.length();
                    if (len == 0) {
                        return o1.compareTo(o2);
                    } else if (len > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return equal;
                }
            }
        }
    }
}
