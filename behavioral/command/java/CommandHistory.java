package behavioral.command.java;

import behavioral.command.java.commands.Command;

import java.util.List;

public class CommandHistory {
    public List<Command> commands;

    public void push(Command c){
        commands.add(c);
    }
    public Command pop(){
        return commands.removeLast();
    }
}
