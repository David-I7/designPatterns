package creational.builder.java.model;

public class Car {

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean hasTripComputer() {
        return tripComputer;
    }

    public boolean hasGPS() {
        return GPS;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean GPS;


    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }
}

