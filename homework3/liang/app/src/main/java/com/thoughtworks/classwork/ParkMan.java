package com.thoughtworks.classwork;

import java.util.Arrays;
import java.util.List;

public class ParkMan {

    List<CarPark> carParks;

    public ParkMan() {
        carParks = Arrays.asList(new CarPark(20), new CarPark(20), new CarPark(20));
    }

    public ParkingCard part(Car car) {
        for (CarPark park : carParks) {
            ParkingCard card = park.part(car);
            if (card != null) {
                return card;
            }
        }
        return null;
    }
}
