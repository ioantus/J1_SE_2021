package main.lesson5_tasks.EasyCommand;

import lombok.RequiredArgsConstructor;

public class MyStringBuilderCommand extends Command{

    public MyStringBuilderCommand(StringBuilder builder) {
        super(builder);
    }

    @Override
    public void append(String str) {
        backup();
        builder.append(str);
    }

    @Override
    public void insert(int offset, String str) {
        backup();
        builder.insert(offset, str);
    }

    @Override
    public void delete(int start, int end) {
        backup();
        builder.delete(start, end);
    }

    @Override
    public void setLength(int newLength) {
        backup();
        builder.setLength(newLength);
    }
}
