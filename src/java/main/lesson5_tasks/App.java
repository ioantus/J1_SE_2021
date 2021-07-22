package main.lesson5_tasks;

import main.Task;

public class App {

    public static void main(final String[] args) {
        System.out.println("\nTask 1:");
        doTask1();
        System.out.println("\nTask 2:");
        doTask2();
        System.out.println("\nTask 3:");
        doTask3();
        System.out.println("\nTask 4:");
        doTask4();
        System.out.println("\nTask 5:");
        doTask5();
        System.out.println("\nTask 6:");
        doTask6();
        System.out.println("\nTask 7:");
        doTask7();
    }

    private static void doTask1() {
        final Integer[] array = {45, 56, 23, 5, 63, 94, 36, 50, 12, 22, -33, -45, 122};
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
        // Fill array
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        final Task task6 = new EasyArraySearch(array, 777777);
        task6.runTask();
        System.out.println(task6.printResult());
    }

    private static void doTask7() {
        final Task task7 = new BaseConverter(36.6f, DegreeGraduation.CELSIUS);
        System.out.println(task7.printResult());
        ((BaseConverter) task7).setNewGraduation(DegreeGraduation.FAHRENHEIT);
        task7.runTask();
        System.out.println(task7.printResult());
        ((BaseConverter) task7).setNewGraduation(DegreeGraduation.KELVIN);
        task7.runTask();
        System.out.println(task7.printResult());
        ((BaseConverter) task7).setNewGraduation(DegreeGraduation.CELSIUS);
        task7.runTask();
        System.out.println(task7.printResult());
    }

}
