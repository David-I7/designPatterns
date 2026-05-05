package creational.factoryMethod.java;

import creational.factoryMethod.java.dialogs.Dialog;
import creational.factoryMethod.java.dialogs.WebDialog;
import creational.factoryMethod.java.dialogs.WindowsDialog;

public class Main {
    public static void main(String[] args) {

        var ENVIRONMENT = "WEB";
        Dialog dialog;

        switch (ENVIRONMENT){
            case "WEB": {
                dialog = new WebDialog();
                break;
            }
            case "WINDOWS": {
                dialog = new WindowsDialog();
                break;
            }
            default: {
                throw new RuntimeException("Environment '" + ENVIRONMENT + "' is not supported");
            }
        }


        dialog.render();
    }
}
