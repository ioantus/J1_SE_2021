package main.lesson5_tasks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import main.Task;

@Setter
@Getter
@RequiredArgsConstructor
public class EasyArraySearch implements Task {

    private final int[] array;
    private final int searchInt;
    private  StringBuilder resultMessage = new StringBuilder();

    @Override
    public void runTask() {
        long startTime;
        // Brute force method
        startTime = System.nanoTime();
        if (resultMessage.length() > 0) {
            resultMessage.delete(0, resultMessage.length() - 1);
        }
        resultMessage.append("bruteForceMethod result is "+String.valueOf(bruteForceMethod(array, searchInt))+
                ", finished in "+String.valueOf(System.nanoTime() - startTime)+" nano seconds \n");
        // Binary Method
        startTime = System.nanoTime();
        resultMessage.append("Binary Method "+String.valueOf(binaryMethod(array, searchInt))+
                ", finished in "+String.valueOf(System.nanoTime() - startTime)+" nano seconds");
    }

    @Override
    public String printResult() {
        return resultMessage.toString();
    }

    private static int bruteForceMethod(int[] array, int searchInt){
        int ret = -1;
        for (int i: array){
            if (i == searchInt){
                ret = i;
                break;
            }
        }
        if (ret > 0) {
            return ret;
        } else {
            throw new RuntimeException("Value not found!");
        }
    }

    private static int binaryMethod(int[] array, int searchInt){
        int cursorCurr = 0;
        int cursorStart = 0;
        int cursorEnd = array.length-1;
        do {
            if (searchInt > array[cursorCurr]) {
                cursorStart = cursorCurr;
            } else {
                cursorEnd = cursorCurr;
            }
            cursorCurr = cursorStart + (cursorEnd - cursorStart) / 2;
        } while (array[cursorCurr] != searchInt);
        return cursorCurr;
    }

}
