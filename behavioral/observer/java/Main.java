package behavioral.observer.java;

import behavioral.observer.java.eventListeners.EmailEventListener;
import behavioral.observer.java.eventListeners.LoggingEventListener;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File curDir = new File(Main.class.getResource(".").getPath());
        File testFile = new File(curDir,"test");
        File logFile = new File(curDir,"test.log");

        EventManager eventManager = new EventManager();
        eventManager.subscribe("save",new LoggingEventListener(logFile.getAbsolutePath()));
        eventManager.subscribe("save",new EmailEventListener("radom@gmail.com"));
        Editor editor = new Editor(eventManager);
        editor.openFile(testFile.getAbsolutePath());
        editor.saveFile();
    }
}
