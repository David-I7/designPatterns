package behavioral.observer.java.eventListeners;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class LoggingEventListener implements EventListener{
    FileWriter fos;

    public LoggingEventListener(String logFilename) throws IOException {
        fos = new FileWriter(logFilename, StandardCharsets.UTF_8);
    }

    @Override
    public void update(String filename) {
        try {
            fos.write(String.format("%s %s %s", "NEW EVENT", OffsetDateTime.now().toString(), filename));
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

