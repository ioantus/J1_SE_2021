package main;

public final class Utils {
    private Utils() {
    }

    public static void printArray(final Integer[] array) {
        for (final Integer i : array) {
            System.out.print(i + " ");
        }
    }

    public static String arrayToString(final Integer[] array) {
        final StringBuilder result = new StringBuilder();
        for (final Integer i : array) {
            result.append(i).append(" ");
        }
        return result.toString();
    }
}
