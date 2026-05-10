package structural.flyweight.java;

// Unique state
public class Tree {
    double x;
    double y;
    TreeType treeType;

    public Tree(double x, double y, TreeType treeType){
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(Object canvas){
        treeType.draw(canvas,x,y);
    }
}
