package creational.builder.java.builders;

import creational.builder.java.model.Manual;

public class CarManualBuilder implements Builder<Manual>{

    private Manual manual = new Manual();

    @Override
    public Builder<Manual> reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Manual build() {
        return manual;
    }

    @Override
    public Builder<Manual> setSeats(int count) {
        manual.setSeats(count);
        return this;
    }

    @Override
    public Builder<Manual> setEngine(String engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder<Manual> setTripComputer(boolean hasTripComputer) {
        manual.setTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder<Manual> setGPS(boolean hasGPS) {
        manual.setGPS(hasGPS);
        return this;
    }


}
