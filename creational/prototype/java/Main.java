package creational.prototype.java;

import creational.prototype.java.shapes.Circle;

public class Main {
    public static void main(String[] args)  {
        Circle circle = new Circle(10,100,5,"red");
        Circle copy = circle.clone();

        System.out.println("circle equals copy?: " + circle.equals(copy));
        System.out.println("circle == copy?: " + (circle == copy));

    }
}
