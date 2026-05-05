package creational.factoryMethod.java.events;

public class ClickEvent extends Event{
    private double x;
    private double y;

    public ClickEvent(double x,double y) {
        super(EventType.CLICK);
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

}
