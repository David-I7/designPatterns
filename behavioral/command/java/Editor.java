package behavioral.command.java;

public class Editor {
    private String text;

    public String getSelection(){
        return "";
    }

    public String deleteSelection(){
        return null;
    }

    public String replaceSelection(String text){
        return "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
