package main.MediumTasks;

import main.MediumTasks.MediumShape.Ball;
import main.MediumTasks.MediumShape.Box;
import main.MediumTasks.MediumShape.Cylinder;
import main.MediumTasks.MediumShape.Pyramid;
import main.Task;
import main.lesson5_tasks.App;
import main.lesson5_tasks.EasyBubbleSort;

public class MediumApp {

    public static void main(final String[] args) {
        System.out.println("\nTask 1:");
        doTask1();
        System.out.println("\nTask 2:");
        doTask2();
        System.out.println("\nTask 3:");
        doTask3();
    }

    private static void doTask1() {
        final Task task1 = new MediumTreeSort("сапог стимул сарай арбуз болт бамбук ананас бокс биржа");
        task1.runTask();
        System.out.println(task1.printResult());
    }

    private static void doTask2() {
        final Task task2 = new MediumEquation(0, 10);
        task2.runTask();
        System.out.println(task2.printResult());
    }

    private static void doTask3() {
        Ball ball = new Ball(2d);
        System.out.println("new Ball: radius = "+ball.getRadius()+", volume = "+ball.getVolume());
        Cylinder cylinder = new Cylinder(3.5d, 4d);
        System.out.println("new Cylinder: height = "+cylinder.getHeight()+
                ", radius = "+cylinder.getRadius()+
                ", volume = "+cylinder.getVolume());
        Pyramid pyramid = new Pyramid(3.85d, 9.99d);
        System.out.println("new Pyramid: s = "+pyramid.getS()+", h = "+pyramid.getH()+
                ", volume = "+pyramid.getVolume());
        Box box = new Box(200);
        System.out.println("new Box: volume = "+box.getVolume());
        System.out.println("Add ball: "+box.add(ball)+", remaining volume = "+box.getVolume());
        System.out.println("Add cylinder: "+box.add(cylinder)+", remaining volume = "+box.getVolume());
        System.out.println("Add ball, which already in box: "+box.add(ball)+", remaining volume = "+box.getVolume());
        System.out.println("Add pyramid: "+box.add(pyramid)+", remaining volume = "+box.getVolume());
    }

}
