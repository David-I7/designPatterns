package structural.flyweight.java;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(double x, double y, String name, String color, String texture){
        trees.add(new Tree(x,y,TreeFactory.getTreeType(name, color, texture)));
    }

    public void draw(Object canvas){
        trees.forEach(tree -> tree.draw(canvas));
    }
}
