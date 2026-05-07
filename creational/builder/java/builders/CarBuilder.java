package creational.builder.java.builders;

import creational.builder.java.model.Car;

public class CarBuilder implements Builder<Car>{

    private Car car = new Car();

    @Override
    public Builder<Car> reset() {
        car = new Car();
        return this;
    }

    @Override
    public Car build() {
        return car;
    }

    @Override
    public Builder<Car> setSeats(int count) {
        car.setSeats(count);
        return this;
    }

    @Override
    public Builder<Car> setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder<Car> setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder<Car> setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
        return this;
    }


}

