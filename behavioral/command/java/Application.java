package behavioral.command.java;

import behavioral.command.java.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public String clipboard = "";
    public List<Editor> editors = new ArrayList<>();
    public Editor activeEditor = null;
    public CommandHistory history = new CommandHistory();

    public void createUI(){}

    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undo(){
        Command c = history.pop();
        c.undo();
    }
}
