package com.thoughtworks.classwork;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    public int max;

    private List<Car> parkList;

    public CarPark(int max) {
        this.max = max;
        parkList = new ArrayList<>();
    }

    public ParkingCard part(Car car) {
        if (parkList.size() < max) {
            parkList.add(car);
            return new ParkingCard(car);
        }
        return null;
    }

    public Car take(ParkingCard card) {
        String cardNum = card.getCardNum();
        for (Car car : parkList) {
            if (car.getCarNum().equals(cardNum)) {
                return car;
            }
        }
        return null;
    }
}
