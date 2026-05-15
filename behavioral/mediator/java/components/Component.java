package behavioral.mediator.java.components;

import behavioral.mediator.java.mediators.Mediator;

public class Component{

    protected Mediator dialog;

    public Component(Mediator dialog){
        this.dialog = dialog;
    }

    public void click(){
        dialog.notify(this,"click");
    }

    public void keypress(){
        dialog.notify(this,"keypress");
    }
}

