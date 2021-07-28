package main.MediumTasks.MediumShape;

import lombok.Getter;

@Getter
public class Pyramid extends Shape{
    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        volume = (1d/3d) * s * h;
    }
}
