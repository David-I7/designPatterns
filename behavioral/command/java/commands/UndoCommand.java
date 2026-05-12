package behavioral.command.java.commands;

import behavioral.command.java.Application;
import behavioral.command.java.Editor;

public class UndoCommand extends Command{
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        application.undo();
    }
}
