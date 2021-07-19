package main.lesson5_tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import main.Task;
import main.Utils;

@Getter
@AllArgsConstructor
public class EasyCleanNumberArray implements Task {
    private final Integer beginNumber;
    private Integer[] array;

    @Override
    public void runTask() {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == beginNumber) {
                array[i] = null;
            } else {
                count++;
            }
        }
        Integer[] resultArray = new Integer[count];
        for (int i = 0, j = 0; i < array.length; i++){
            if (!(array[i] == null)) {
                resultArray[j++] = array[i];
            }
        }
        array = resultArray;
    }

    @Override
    public String printResult() {
        return Utils.arrayToString(array);
    }
}

