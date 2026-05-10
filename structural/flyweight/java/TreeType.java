package structural.flyweight.java;

// Repeating state -> Make it a separate class
public class TreeType {
    String name;
    String color;
    String texture;

    public TreeType(String name,String color,String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Object canvas, double x, double y){

    }
}
