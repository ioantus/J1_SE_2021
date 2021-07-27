package main.lesson5_tasks;

import lombok.RequiredArgsConstructor;
import main.Task;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class EasyArrayToMap<K> implements Task {
    private final K[] array;
    private Map<K, Integer> map = new HashMap<K, Integer>();

    @Override
    public void runTask() {
        map = arrayToMap(array);
    }

    @Override
    public String printResult() {
        StringBuilder retStr = new StringBuilder();
        for (var entry: map.entrySet()){
            retStr.append(String.format("Key: %s, value: %d\n", entry.getKey().toString(), entry.getValue()));
        }
        return retStr.toString();
    }

    private Map<K, Integer> arrayToMap(K[] ks) {
        for (K element: ks){
            map.merge(element, 1, Integer::sum);
        }
        return map;
    }

}
