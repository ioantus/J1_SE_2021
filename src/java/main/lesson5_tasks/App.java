package main.lesson5_tasks;

import main.Task;
import main.lesson5_tasks.EasyCommand.MyStringBuilder;
import main.lesson5_tasks.EasyIterator.IteratorTask;
import main.lesson5_tasks.EasyTreeIterator.TreeIterator;
import main.lesson5_tasks.EasyTreeIterator.TreeIteratorTask;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("\nTask 8:");
        doTask8();
        System.out.println("\nTask 9:");
        doTask9();
        System.out.println("\nTask 10:");
        doTask10();
        System.out.println("\nTask 11:");
        doTask11();
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

    private static void doTask8() {
        final MyStringBuilder builder = new MyStringBuilder();
        builder.append("1,2,test");
        System.out.println("append: "+builder.toString());
        builder.insert(4,"3,4,5");
        System.out.println("insert: "+builder.toString());
        builder.delete(5,8);
        System.out.println("delete: "+builder.toString());
        builder.append(" Test complete!");
        System.out.println("append: "+builder.toString());
        builder.undo();
        System.out.println("undo: "+builder.toString());
        builder.undo();
        System.out.println("undo: "+builder.toString());
        builder.undo();
        System.out.println("undo: "+builder.toString());
        builder.undo();
        System.out.println("undo: "+builder.toString());
    }


    private static void doTask9() {
        final Task task9 = new IteratorTask(10, 15);
        task9.runTask();
        System.out.println(task9.printResult());
    }

    private static void doTask10() {
        final Task task10 = new TreeIteratorTask(new ArrayList());
        ArrayList array1, array2, array3, array4, array5, array6;
        ((TreeIteratorTask)task10).addElement("1");
        ((TreeIteratorTask)task10).addElement("2");
        array1 = new ArrayList();
        array1.add("3");
        ((TreeIteratorTask)task10).addElement(new TreeIterator(array1));
        array2 = new ArrayList();
        array3 = new ArrayList();
        array2.add("4");
        array2.add("5");
        array3.add("6");
        array3.add("7");
        array3.add("8");
        array2.add(new TreeIterator(array3));
        ((TreeIteratorTask)task10).addElement(new TreeIterator(array2));
        array4 = new ArrayList();
        array5 = new ArrayList();
        array6 = new ArrayList();
        array4.add(new TreeIterator(array5));
        array5.add("9");
        array5.add(new TreeIterator(array6));
        array6.add("10");
        array6.add("11");
        array6.add("12");
        ((TreeIteratorTask)task10).addElement(new TreeIterator(array4));
        task10.runTask();
        System.out.println(task10.printResult());
    }

    private static void doTask11() {
        String[] arrayString = {"12","ab","Ab","12","aA","Ab","cv","cv","aA","12","23","cv"};
        final Task task11 = new EasyArrayToMap(arrayString);
        task11.runTask();
        System.out.println(task11.printResult());
    }

}
