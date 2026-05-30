package behavioral.chainOfResponsability.java;

public class Dialog extends Container{
    protected String wikiPage;

    public Dialog(String wikipage){
        this.wikiPage = wikipage;
    }

    @Override
    public void showHelp() {
        if(wikiPage != null){
            System.out.println("Opening " + wikiPage);
        }else super.showHelp();
    }
}
