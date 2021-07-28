package main.MediumTasks;

import lombok.RequiredArgsConstructor;
import main.Task;

@RequiredArgsConstructor
public class MediumEquation implements Task {
    private final double numberFrom;
    private final double numberTo;
    private double result;

    @Override
    public void runTask() {
       result = binarySearch();
    }

    @Override
    public String printResult() {
        return String.valueOf(result);
    }

    private double binarySearch(){
        double currentX = 0;
        double result;
        double cursorStart = numberFrom;
        double cursorEnd = numberTo;
        do {
            result = calcEquation(currentX);
            if (result > 0.001) {
                cursorEnd = currentX;
            } else if (result < -0.001) {
                cursorStart = currentX;
            } else {
                break;
            }
            currentX = cursorStart + (cursorEnd - cursorStart) / 2;
        } while (true);
        return currentX;
    }

    private double calcEquation(double x){
        return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3*x - 23;
    }

}
