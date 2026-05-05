package creational.factoryMethod.java.dialogs;

import creational.factoryMethod.java.buttons.Button;
import creational.factoryMethod.java.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }

    @Override
    public void render() {
        Button button = createButton();
        button.render();
    }
}
