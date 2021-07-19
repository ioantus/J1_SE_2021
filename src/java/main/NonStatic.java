package main;

public class NonStatic {

    private final String context;

    public NonStatic(final String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public enum QQQ {
        Q1("Q1"),
        Q2("Q2"),
        Q3("Q3");

        public String s;

        QQQ(String s) {
            this.s = s;
        }
    }
}
