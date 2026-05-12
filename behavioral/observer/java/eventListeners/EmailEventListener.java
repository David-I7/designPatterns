package behavioral.observer.java.eventListeners;

import java.io.IOException;

public class EmailEventListener implements EventListener{
    private String email;

    public EmailEventListener(String email) throws IOException {
        this.email = email;
    }

    @Override
    public void update(String filename) {
        System.out.println("Sending email to " + email + "...");
    }
}
