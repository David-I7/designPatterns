package creational.prototype.java.shapes;

import java.util.Objects;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other){
        super(other);
        this.width = other.width;
        this.height = other.height;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rect = (Rectangle) object;
        return Double.compare(width, rect.width) == 0
                && Double.compare(height,rect.height) == 0
                && Double.compare(x,rect.x) == 0
                && Double.compare(y,rect.y) == 0
                && color.equals(rect.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(width) + Objects.hashCode(height) + Objects.hashCode(x) + Objects.hashCode(y) + color.hashCode();
    }
}

