package main;

public class lesson2 {

    public static void main (final String[] args) {
        // Массивы
        String[] values = {"a","b","c"};
        System.out.println(values);

        System.out.println("regular (for (int i = 0; i < values.length; i++))):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        System.out.println("lambda (for (String value:values))):");
        for (String value:values) {
            System.out.println(value);
        }

        System.out.println("while without conditions:");
        int i = 0;
        String value;
        while (true) {
            if (i >= values.length) {break;}
            value = values[i];
            System.out.println(value);
            i++;
        }

        System.out.println("while with conditions:");
        i = 0;
        while (i < values.length) {
            value = values[i];
            System.out.println(value);
            i++;
        }


        System.out.println(" do while ");
        i = 0;
        // values = new String[0];     // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        do {
            value = values[i];
            System.out.println(value);
            i++;
        } while (i < values.length);

        System.out.println(" if ");
        if (true || false && true) {   // boolean
            System.out.println("exp1 = true");
        } else if (true) {
            System.out.println("exp2 = true");
        } else {
            System.out.println("exp3 = false");
        }

/**
 *
 *         switch (ВыражениеДляВыбора) {
 *             case  (Значение1):
 *                 Код1;
 *                 break;
 *             case (Значение2):
 *                 Код2;
 *                 break;
 *             ...
 *             case (ЗначениеN):
 *                 КодN;
 *                 break;
 *             default:
 *                 КодВыбораПоУмолчанию;
 *                 break;
 *         }
 *
 */


    }

}
