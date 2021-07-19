package main;

public class Main {
    public static final NonStatic n = new NonStatic("non - static");

    public static void main(String[] args) {
        String smth = doSmth(args[0]);

        System.out.println(n.getContext());
        System.out.println(smth);
        System.out.println(NonStatic.QQQ.Q1.s);
        System.out.println(NonStatic.QQQ.valueOf("Q3"));
    }

    public static String doSmth(final String str1) throws IndexOutOfBoundsException {
        return str1 + " - Modified!";
    }
}
