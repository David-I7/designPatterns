package behavioral.observer.java;

import java.io.File;

public class Editor {
    private EventManager eventManager;
    private File file;

    public Editor(EventManager eventManager){
        this.eventManager = eventManager;
    }

    public void openFile(String path){
        file = new File(path);
        eventManager.notify("open",file.getAbsolutePath());
    }

    public void saveFile(){
        // flush buffered data
        eventManager.notify("save",file.getAbsolutePath());
    }
}
