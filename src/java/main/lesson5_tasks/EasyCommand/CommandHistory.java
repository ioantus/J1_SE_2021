package main.lesson5_tasks.EasyCommand;
import lombok.NoArgsConstructor;

import java.util.Stack;

@NoArgsConstructor
public class CommandHistory {
    private Stack<MyStringBuilderCommand> history = new Stack<MyStringBuilderCommand>();

    public void push(MyStringBuilderCommand command) {
        history.push(command);
    }

    public MyStringBuilderCommand pop(){
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}
