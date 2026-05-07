package creational.builder.java.directors;

import creational.builder.java.model.Car;
import creational.builder.java.model.Manual;
import creational.builder.java.builders.CarBuilder;
import creational.builder.java.builders.CarManualBuilder;

public class Director {

    private CarBuilder carBuilder = new CarBuilder();
    private CarManualBuilder carManualBuilder = new CarManualBuilder();

    public Car constructSportsCar(){
        return carBuilder
                .reset()
                .setSeats(2)
                .setEngine("Sports Car Engine")
                .setGPS(true)
                .setTripComputer(true)
                .build();
    }
    public Manual constructSportsCarManual(){
        return carManualBuilder
                .reset()
                .setSeats(2)
                .setEngine("Sports Car Engine")
                .setGPS(true)
                .setTripComputer(true)
                .build();
    }
}
