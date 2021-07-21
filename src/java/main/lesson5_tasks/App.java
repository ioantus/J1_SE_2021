package main.lesson5_tasks;

import main.Task;

public class App {

    public static void main(final String[] args) {
        doTask6();
    }

    private static void doTask1() {
        final Integer[] array = {45, 56, 23, 05, 63, 94, 36, 50, 12, 22, -33, -45, 122};
        final Task task1 = new EasyBubbleSort(array);
        task1.runTask();
        System.out.println(task1.printResult());
    }

    private static void doTask2() {
        final Task task2 = new EasyEvenArray(100);
        task2.runTask();
        System.out.println(task2.printResult());
    }

    private static void doTask3() {
        Integer[] array = {2, 1, 4, 2, 43, 34, 4, 23, 6, 2, -22, -65, -2};
        final Task task3 = new EasyCleanNumberArray(2, array);
        task3.runTask();
        System.out.println(task3.printResult());
    }

    private static void doTask4() {
        final Task task4 = new EasyVector();
        System.out.println(task4.printResult());
    }

    private static void doTask5() {
        int[] numbers = {1,3,6,2};
        int[] weights = {1,31,7,12};
        final Task task5 = new EasyRandomNumberFromArray(numbers, weights);
        task5.runTask();
        System.out.println(task5.printResult());
        task5.runTask();
        System.out.println(task5.printResult());
        task5.runTask();
        System.out.println(task5.printResult());
    }

    private static void doTask6() {
        // Create array
        int[] array = new int[1000000];
        long startTime;
        // Fill array
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        final Task task6 = new EasyArraySearch(array, 777777);
        task6.runTask();
        System.out.println(task6.printResult());
    }


}
