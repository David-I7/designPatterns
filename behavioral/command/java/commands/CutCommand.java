package behavioral.command.java.commands;

import behavioral.command.java.Application;
import behavioral.command.java.Editor;

public class CutCommand extends Command{
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        application.clipboard = editor.getSelection();
        editor.deleteSelection();
    }
}

