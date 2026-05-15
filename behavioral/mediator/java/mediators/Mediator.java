package behavioral.mediator.java.mediators;

import behavioral.mediator.java.components.Component;

public interface Mediator {
    void notify(Component component, String event);
}

