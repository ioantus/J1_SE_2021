package main.lesson3;

import java.util.Scanner;

public class MyPrimitiveType {

    public static void main(String[] args) {
        byte b = -128;
        try {
            System.out.println(Byte.valueOf("-2225"));
        } catch (NumberFormatException e) {
            System.out.println("Can't parce such value");
        }

        int i3 = 2223;
        int i4 = 2220 + 3;

        System.out.println("i3 == i4 is " + String.valueOf(i3 == i4));

        int i = 23;
        Integer i1 = Integer.valueOf(i);

        Integer i2 = new Integer(23);

        System.out.println("i1.equals(i2) is " + String.valueOf(i1.equals(i2)));


        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is " + String.valueOf(s1 == s2));

        String s3 = new String("abc");

        System.out.println("s1 == s3 is " + String.valueOf(s1 == s3));
        System.out.println("s1.equals(s3) is " + s1.equals(s3));

        String s4 = (s3 + s2).intern();
        String s5 = "abcabc";

        System.out.println("s4 == s5 is " + String.valueOf(s4 == s5));

        System.out.println("s5.contains('r') is " + String.valueOf(s5.contains("r")));
        System.out.println("s5.charAt(1) is " + s5.charAt(1));

        // Read input from console
        final Scanner scanner = new Scanner(System.in);
//        int nextInt = scanner.NextInt();
//        System.out.println(nextInt);
        String nextLine = scanner.nextLine();
        System.out.println(nextLine);
    }
}
