package creational.abstractFactory.java;

import creational.abstractFactory.java.buttons.Button;
import creational.abstractFactory.java.checkbox.Checkbox;
import creational.abstractFactory.java.factories.GUIFactory;

public class Application {
    GUIFactory factory;
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory factory){
        this.factory = factory;
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render(){
        button.render();
        checkbox.render();
    }
}
