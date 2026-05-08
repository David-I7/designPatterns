package structural.composite.java;

import structural.composite.java.graphics.Circle;
import structural.composite.java.graphics.CompoundGraphic;
import structural.composite.java.graphics.Dot;

public class Application {
    private CompoundGraphic compoundGraphic;

    public Application(){
        compoundGraphic = new CompoundGraphic(0,0,500,500);
        compoundGraphic.add(new CompoundGraphic(0,0,100,100));
        compoundGraphic.add(new Circle(200,200,5));
        compoundGraphic.add(new Dot(499,499));
    }

    public void render(){
        compoundGraphic.draw();
    }
}
