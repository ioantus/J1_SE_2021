package main.MediumTasks.MediumShape;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Box extends Shape{
    private final HashSet<Shape> containedShapes;

    public Box(double volume) {
        containedShapes = new HashSet<Shape>();
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (containedShapes.contains(shape)) {
            return false;
        } else if (volume >= shape.getVolume()) {
            containedShapes.add(shape);
            volume = volume - shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
