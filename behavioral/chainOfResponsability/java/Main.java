package behavioral.chainOfResponsability.java;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog("http://...");
        Panel panel = new Panel(0,0,400,800);
        panel.setModalHelpText("This panel does...");
        Button okButton = new Button();
        okButton.setTooltipText("This is an OK button that...");
        Button cancelButton = new Button();
        okButton.setTooltipText("This is an CANCEL button that...");

        panel.add(okButton);
        panel.add(cancelButton);
        dialog.add(panel);

        dialog.showHelp();
    }
}
