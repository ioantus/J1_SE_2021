package main.lesson5_tasks;

import main.Task;

enum DegreeGraduation {CELSIUS, FAHRENHEIT, KELVIN};

public class BaseConverter implements Task {

    private float value;
    private DegreeGraduation currentGraduation;
    private DegreeGraduation newGraduation;

    public BaseConverter(float value, DegreeGraduation currentGraduation) {
        this.value = value;
        this.currentGraduation = currentGraduation;
    }

    public void setNewGraduation(DegreeGraduation newGraduation) {
        this.newGraduation = newGraduation;
    }

    @Override
    public void runTask() {
        if (currentGraduation == newGraduation) {
            return;
        }
        if (currentGraduation != DegreeGraduation.CELSIUS) {
            if (currentGraduation == DegreeGraduation.FAHRENHEIT) {
                convertFromFahrenheit();
            } else if (currentGraduation == DegreeGraduation.KELVIN) {
                convertFromKelvin();
            }
        }
        if (currentGraduation == DegreeGraduation.CELSIUS) {
            if (newGraduation == DegreeGraduation.FAHRENHEIT) {
                convertToFahrenheit();
            } else if (newGraduation == DegreeGraduation.KELVIN) {
                convertToKelvin();
            }
        }
    }

    public void convertToFahrenheit(){
        if (currentGraduation == DegreeGraduation.CELSIUS) {
            value = value * (9f / 5f) + 32f;
            currentGraduation = DegreeGraduation.FAHRENHEIT;
        }
    }

    public void convertFromFahrenheit(){
        if (currentGraduation == DegreeGraduation.FAHRENHEIT) {
            value = (value - 32f) * (5f / 9f);
            currentGraduation = DegreeGraduation.CELSIUS;
        }
    }

    public void convertToKelvin(){
        if (currentGraduation == DegreeGraduation.CELSIUS) {
            value = value + 273.15f;
            currentGraduation = DegreeGraduation.KELVIN;
        }
    }

    public void convertFromKelvin(){
        if (currentGraduation == DegreeGraduation.KELVIN) {
            value = value - 273.15f;
            currentGraduation = DegreeGraduation.CELSIUS;
        }
    }

    @Override
    public String printResult() {
        return String.valueOf(value) + " "+String.valueOf(currentGraduation);
    }


}
