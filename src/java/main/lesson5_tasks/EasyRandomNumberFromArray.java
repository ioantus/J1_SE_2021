package main.lesson5_tasks;

import lombok.Getter;
import main.Task;

@Getter
public class EasyRandomNumberFromArray implements Task {
    private final int[] numbers;
    private final int[] weights;
    private long fullLength;
    private Integer randomNumber;

    EasyRandomNumberFromArray(int[] numbers, int[] weights) {
        this.numbers = numbers;
        this.weights = weights;
        fullLength = this.numbers.length * this.weights.length;
    }

    @Override
    public void runTask() {
        int intRes = (int)Math.round(Math.random()*fullLength);
        int innerCount = 0;
        for (int num:numbers){
            for (int weight:weights){
                if (++innerCount == intRes) {
                    randomNumber = num;
                };
            }
        }
    }

    @Override
    public String printResult() {
        return "Random number from array is "+String.valueOf(randomNumber);
    }
}

class randomArraySelect{
    private final int[] numbers;
    private final int[] weights;
    private int count = 0;

    randomArraySelect(int[] numbers, int[] weights) {
        this.numbers = numbers;
        this.weights = weights;
        for (int num:numbers){
            for (int weight:weights){
                count++;
            }
        }
    }

    public Integer randomValue(){
        int intRes = (int)Math.round(Math.random()*count);
        int innerCount = 0;
        Integer ret = null;
        for (int num:numbers){
            for (int weight:weights){
                if (++innerCount == intRes) {
                    ret = num;
                };
            }
        }
        return ret;
    }

}
