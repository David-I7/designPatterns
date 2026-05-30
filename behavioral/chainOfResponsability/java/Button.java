package behavioral.chainOfResponsability.java;

public class Button extends Component{
    protected String tooltipText;

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    @Override
    public void showHelp() {
        if(tooltipText != null){
            System.out.println(tooltipText);
        }else super.showHelp();
    }
}

