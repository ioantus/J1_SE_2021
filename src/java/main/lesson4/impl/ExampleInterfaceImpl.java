package main.lesson4.impl;

import main.lesson4.ExampleInterface;

public class ExampleInterfaceImpl implements ExampleInterface {

    public String name = "new name";

    @Override
    public void myDefault() {
        System.out.println("default from custom impl");
    }

    @Override
    public void standart() {
        System.out.println("standart from custom impl");
    }

}
