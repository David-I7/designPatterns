package creational.abstractFactory.java.factories;

import creational.abstractFactory.java.buttons.Button;
import creational.abstractFactory.java.buttons.WinButton;
import creational.abstractFactory.java.checkbox.Checkbox;
import creational.abstractFactory.java.checkbox.WinCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
