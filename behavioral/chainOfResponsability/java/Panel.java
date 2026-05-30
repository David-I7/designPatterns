package behavioral.chainOfResponsability.java;

public class Panel extends Container{
    protected String modalHelpText;

    int x1=0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Panel(int x1,int y1,int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if(modalHelpText != null){
            System.out.println("Show modal with help text");
        }else super.showHelp();
    }
}

