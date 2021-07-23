package main.lesson5_tasks.EasyCommand;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Command {
    protected final StringBuilder builder;
    private String backup;

    public abstract void append(String str);
    public abstract void insert(int offset, String str);
    public abstract void delete(int start, int end);
    public abstract void setLength(int newLength);

    public void undo(){
        builder.setLength(backup.length());
        builder.replace(0, backup.length(), backup);
    }

    public void backup(){
        backup = builder.toString();
    }

}
