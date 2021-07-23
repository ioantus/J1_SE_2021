package main.lesson5_tasks.EasyCommand;

public class MyStringBuilder {
    private final StringBuilder builder;
    private CommandHistory history;

    public MyStringBuilder() {
        this.builder = new StringBuilder();
        history = new CommandHistory();
    }

    public void undo(){
        history.pop().undo();
    }

    public void append(String str) {
        MyStringBuilderCommand command = new MyStringBuilderCommand(builder);
        command.append(str);
        history.push(command);
    }

    public void insert(int offset, String str) {
        MyStringBuilderCommand command = new MyStringBuilderCommand(builder);
        command.insert(offset, str);
        history.push(command);
    }

    public void delete(int start, int end) {
        MyStringBuilderCommand command = new MyStringBuilderCommand(builder);
        command.delete(start, end);
        history.push(command);
    }

    public int length() {
        return builder.length();
    }

    public void setLength(int newLength) {
        MyStringBuilderCommand command = new MyStringBuilderCommand(builder);
        command.setLength(newLength);
        history.push(command);
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
