package behavioral.chainOfResponsability.java;

public abstract class Component implements ComponentWithContextualHelp{

    protected String tooltipText;

    protected Container container;

    @Override
    public void showHelp() {
        if(tooltipText != null){
            System.out.println("showing tooltip");
        }else{
            container.showHelp();
        }
    }
}
