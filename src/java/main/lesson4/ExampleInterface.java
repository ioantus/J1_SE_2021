package main.lesson4;

public interface ExampleInterface {

    public static String name = "interface";

    default void myDefault(){
        System.out.println("Default works!");
    }

    static void myStatic(){
        System.out.println("Static works!");
    }

    void standart();
}
