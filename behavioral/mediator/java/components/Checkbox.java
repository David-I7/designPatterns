package behavioral.mediator.java.components;

import behavioral.mediator.java.mediators.Mediator;

public class Checkbox extends Component{
    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    private boolean checked = false;

    public void check(){
        dialog.notify(this,"check");
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
