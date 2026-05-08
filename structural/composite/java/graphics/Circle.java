package structural.composite.java.graphics;

public class Circle extends Dot{

    private double radius;

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
