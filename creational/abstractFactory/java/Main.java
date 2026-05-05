package creational.abstractFactory.java;

import creational.abstractFactory.java.factories.GUIFactory;
import creational.abstractFactory.java.factories.WinFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();

        Application application = new Application(factory);

        application.render();
    }
}
