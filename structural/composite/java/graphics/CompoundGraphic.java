package structural.composite.java.graphics;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{

    List<Graphic> graphics = null;
    double x; 
    double y;
    double width;
    double height;
    
    public CompoundGraphic(double x, double y,double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void add(Graphic graphic){
        if(graphics == null){
            graphics = new ArrayList<>();
        }
        graphics.add(graphic);
    }

    public void remove(Graphic graphic){
        if(graphic == null){
            return;
        }
        for(int i = 0; i < graphics.size();++i){
            if(graphics.get(i).equals(graphic)){
                graphics.remove(i);
                break;
            }
        }
        if(graphics.size() == 0) graphics = null;
    }
    
    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Compound graphic");
        if(graphics != null){
            graphics.stream().forEach(graphic -> graphic.draw());
        }
    }
}
