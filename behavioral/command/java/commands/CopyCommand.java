package behavioral.command.java.commands;

import behavioral.command.java.Application;
import behavioral.command.java.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        application.clipboard = editor.getSelection();
    }
}

