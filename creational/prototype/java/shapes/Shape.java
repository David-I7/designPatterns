package creational.prototype.java.shapes;

public abstract class Shape {
    double x;
    double y;
    String color;

    Shape(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    Shape(Shape other){
        this.x = other.x;
        this.y = other.y;
        this.color = other.color;
    }

}
