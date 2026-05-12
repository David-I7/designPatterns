package behavioral.command.java.commands;

import behavioral.command.java.Application;
import behavioral.command.java.Editor;

public class PasteCommand extends Command{
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        editor.replaceSelection(application.clipboard);
    }
}

