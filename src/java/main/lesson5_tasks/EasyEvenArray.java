package main.lesson5_tasks;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import main.Task;

import java.util.ArrayList;

@Getter
@RequiredArgsConstructor
public class EasyEvenArray implements Task {

    private final Integer arrayLength;
    private ArrayList<Integer> evenArray = new ArrayList();

    @Override
    public void runTask(){
        for (int i = 1; i<=arrayLength; i++) {
            if (i % 2 == 0) {
                evenArray.add(i);
            }
        }
    }

    @Override
    public String printResult() {
        return evenArray.toString();
    }
}
