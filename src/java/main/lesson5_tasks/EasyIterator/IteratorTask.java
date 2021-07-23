package main.lesson5_tasks.EasyIterator;

import main.Task;

import java.util.Iterator;

public class IteratorTask implements Task {
    final static int MAX_VALUE = 10;
    private final Integer verticalLength;
    private final Integer horisontalLength;
    private Integer[][] array = new Integer[10][15];;
    private StringBuilder stringResult;

    public IteratorTask(Integer verticalLength, Integer horisontalLength) {
        this.verticalLength = verticalLength;
        this.horisontalLength = horisontalLength;
        Integer[][] array = new Integer[verticalLength][horisontalLength];
        stringResult = new StringBuilder();
        randomFillArray();
    }

    public void randomFillArray() {
        for(int i = 0; i < verticalLength; i++){
            for(int j = 0; j< horisontalLength; j++){
                array[i][j] = (int)Math.round(MAX_VALUE * Math.random());
            }
        }
    }

    @Override
    public void runTask() {
        if (stringResult.length() > 0) {
            stringResult.delete(0, stringResult.length() - 1);
        }
        randomFillArray();
        Iterator<Integer> iterator = new EasyIterator(array);
        while (iterator.hasNext()) {
            stringResult.append(String.valueOf(iterator.next()));
            stringResult.append(", ");
            if (((EasyIterator)iterator).isNewLine()) {
                stringResult.append("\n");
            }
        }
        stringResult.setLength(stringResult.length()-3);
    }

    @Override
    public String printResult() {
        return stringResult.toString();
    }
}
