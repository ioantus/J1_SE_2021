package main.lesson5_tasks.EasyTreeIterator;

import lombok.RequiredArgsConstructor;
import main.Task;

import java.util.ArrayList;

@RequiredArgsConstructor
public class TreeIteratorTask implements Task {
    private final ArrayList treeArray;
    private TreeIterator treeIterator;

    public void addElement(Object element){
        treeArray.add(element);
    }

    @Override
    public void runTask() {
        treeIterator = new TreeIterator(treeArray);
    }

    @Override
    public String printResult() {
        StringBuilder retStr = new StringBuilder();
        while (treeIterator.hasNext()){
            retStr.append((String)treeIterator.next()+",");
        }
        retStr.delete(retStr.length()-1, retStr.length());
        return retStr.toString();
    }
}
