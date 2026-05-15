package behavioral.mediator.java.mediators;

import behavioral.mediator.java.components.Button;
import behavioral.mediator.java.components.Checkbox;
import behavioral.mediator.java.components.Component;
import behavioral.mediator.java.components.Textbox;

public class AuthenticationDialog implements Mediator{

    private String title;

    private Checkbox loginOrRegisterCheckbox;

    private Textbox loginUsername, loginPassword;

    private Textbox registrationUsername, registrationPassword,
            registrationEmail;

    private Button okBtn, cancelBtn;

    public AuthenticationDialog(){
        loginOrRegisterCheckbox = new Checkbox(this);
        loginUsername = new Textbox(this);
        loginPassword = new Textbox(this);
        registrationUsername = new Textbox(this);
        registrationPassword = new Textbox(this);
        registrationEmail = new Textbox(this);
        okBtn = new Button(this);
        cancelBtn = new Button(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterCheckbox && event.equals("check")) {
            if (loginOrRegisterCheckbox.isChecked())
                title = "Log in";
                // 1. Show login form components.
                // 2. Hide registration form components.
            else
                title = "Register";
            // 1. Show registration form components.
            // 2. Hide login form components
        }

        if (sender == okBtn && event.equals("click")) {
            //if (loginOrRegister.checked)
            // Try to find a user using login credentials.
            //    if (!found)
                    // Show an error message above the login field.
                //  else
                    // 1. Create a user account using data from the
                    // registration fields.
                    // 2. Log that user in.
                    // ...
        }
    }
}
