package creational.factoryMethod.java.buttons;

import creational.factoryMethod.java.events.ClickEvent;
import creational.factoryMethod.java.events.Event;

import java.util.function.Consumer;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button></button>");
    }

    @Override
    public void onClick(Consumer<Event> handler) {
        handler.accept(new ClickEvent(Math.random() * 500,Math.random() * 500));
    }
}

