package main.MediumTasks.MediumShape;

import lombok.Getter;

@Getter
public class Cylinder extends SolidOfRevolution{
    private final double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.volume = Math.PI * Math.pow(radius, 2) * height;
    }
}
