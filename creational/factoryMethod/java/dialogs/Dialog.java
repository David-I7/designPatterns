package creational.factoryMethod.java.dialogs;

import creational.factoryMethod.java.buttons.Button;

public abstract class Dialog {

     protected abstract Button createButton();

     public abstract void render();
}

