package creational.prototype.java.shapes;

import java.util.Objects;

public class Circle extends Shape{

    private double radius;

    public Circle(double x, double y, double radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle other){
        super(other);
        this.radius = other.radius;
    }

    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Circle circle = (Circle) object;
        return Double.compare(radius, circle.radius) == 0
                && Double.compare(x,circle.x) == 0
                && Double.compare(y,circle.y) == 0
                && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius) + Objects.hashCode(x) + Objects.hashCode(y) + color.hashCode();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
