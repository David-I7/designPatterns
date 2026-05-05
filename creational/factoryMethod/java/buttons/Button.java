package creational.factoryMethod.java.buttons;

import creational.factoryMethod.java.events.Event;

import java.util.function.Consumer;

public interface Button{
    void render();
    void onClick(Consumer<Event> handler);
}
