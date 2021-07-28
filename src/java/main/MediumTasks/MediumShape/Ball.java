package main.MediumTasks.MediumShape;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        this.radius = radius;
        this.volume = (4/3) * Math.PI * Math.pow(radius, 3);
    }
}
