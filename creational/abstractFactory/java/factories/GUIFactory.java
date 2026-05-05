package creational.abstractFactory.java.factories;

import creational.abstractFactory.java.buttons.Button;
import creational.abstractFactory.java.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

