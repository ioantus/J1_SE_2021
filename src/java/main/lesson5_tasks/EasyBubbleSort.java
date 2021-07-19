package main.lesson5_tasks;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import main.Task;
import main.Utils;

@Getter
@RequiredArgsConstructor
public class EasyBubbleSort implements Task {

    private final Integer[] intArray;

    @Override
    public void runTask(){
        boolean bDone = false;
        int tmpInt;
        while (!bDone) {
            bDone = true;
            for (int i = 0; i <= intArray.length-2; i++) {
                if (intArray[i] > intArray[i+1]) {
                    bDone = false;
                    tmpInt = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = tmpInt;
                }
            }
        }
    }

    @Override
    public String printResult() {return Utils.arrayToString(intArray);}

}
