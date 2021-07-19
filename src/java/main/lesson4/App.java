package main.lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import main.lesson4.impl.ExampleInterfaceImpl;

public class App {
    public static void main(String[] args){
        ExampleInterface.myStatic();
        ExampleInterface exampleInterface = new ExampleInterface(){

            public String name = "new name";

            @Override
            public void myDefault() {
                System.out.println("default implementation from anonym class works!");
            }

            public ReturnDTO myDefault(final String param1) {
                System.out.println("overloaded method with param1 = " + param1);
                return new ReturnDTO(param1, 15);
            }

            @Override
            public void standart() {
                System.out.println("Standart works!");
            }

        };
        exampleInterface.myDefault();
        exampleInterface.standart();
        System.out.println(exampleInterface.name);

        myDefault("arg1", "arg2", "arg3", "arg4");

        ExampleInterfaceImpl custom = new ExampleInterfaceImpl();
        custom.myDefault();
        custom.standart();
        System.out.println(custom.name);

        String s1 = "string1";
        ReturnDTO returnDTO = new ReturnDTO("s2", 12);
        test_md(s1, returnDTO);
    }

    public static ReturnDTO myDefault(final String... param1) {
        System.out.println("overloaded method with param1 = " + param1);
        return new ReturnDTO(param1[0], 15);
    }

    public static void test_md(String s, ReturnDTO returnDTO){
        s = "new value \"s\"";
        System.out.println("value in method " + s);
        returnDTO.setCount(200);
    }

    @Data
    @ToString
    @AllArgsConstructor
    private static class ReturnDTO {

        private String param1;
        private Integer count;

        /*
        public String getParam1() {
            return param1;
        }

        public Integer getCount() {
            return count;
        }

        private ReturnDTO(String param1, Integer count) {
            this.param1 = param1;
            this.count = count;
        }*/
    }
}
