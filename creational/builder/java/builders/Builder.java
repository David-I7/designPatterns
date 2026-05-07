package creational.builder.java.builders;

public interface Builder<T>{
    Builder<T> reset();
    T build();
    Builder<T> setSeats(int count);Builder<T> setEngine(String engine);
    Builder<T> setTripComputer(boolean hasTripComputer);
    Builder<T> setGPS(boolean hasGPS);
}

