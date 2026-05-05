package creational.factoryMethod.java.dialogs;

import creational.factoryMethod.java.buttons.Button;
import creational.factoryMethod.java.buttons.HtmlButton;

public class WebDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }

    @Override
    public void render() {
        Button button = createButton();
        button.render();
    }
}

