package main.lesson5_tasks;

import lombok.NoArgsConstructor;
import lombok.Setter;
import main.Task;

enum DegreeGraduation {CELSIUS, FAHRENHEIT, KELVIN};

@Setter
@NoArgsConstructor ArgsConstructor
public class BaseConverter implements Task {

    private float value;
    private DegreeGraduation currentGraduation;
    private DegreeGraduation newGraduation;

    @Override
    public void runTask() {
        if (currentGraduation == newGraduation) {
            return;
        } else {
            if (currentGraduation = DegreeGraduation.CELSIUS) {
                if (newGraduation = DegreeGraduation.FAHRENHEIT) {
                    value = value * (9 / 5) + 32;
                } else {
                    value = value + 273.15;
                }
            } else if (currentGraduation = DegreeGraduation.FAHRENHEIT) {
                if (newGraduation = DegreeGraduation.CELSIUS) {
                    value = (value - 32) * (5 / 9);
                } else {

                }
            }

        }
    }

    @Override
    public String printResult() {
        return null;
    }
}
