package main.lesson4;

public class NullConception {

    private static String example;// = new String("some String");

    public static void main(String[] args){
        if (example != null) {
            System.out.println(example.length());
        } else {
            System.out.println("There is \"null\" instead of link");
        };

        boolean a = true;
        Boolean b = null;
        b = true;
        b = false;

    }
}
