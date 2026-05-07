package creational.builder.java;

import creational.builder.java.directors.Director;
import creational.builder.java.model.Car;
import creational.builder.java.model.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sportsCar = director.constructSportsCar();
        Manual sportsCarManual = director.constructSportsCarManual();

        System.out.println(sportsCar);
        System.out.println(sportsCarManual);
    }
}
