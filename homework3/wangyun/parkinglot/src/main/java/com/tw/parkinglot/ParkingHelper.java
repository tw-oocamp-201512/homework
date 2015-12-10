package com.tw.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingHelper {
    private List<ParkingLot> parkinglotList = new ArrayList<>();

    public ParkingHelper() {
        parkinglotList.add(new ParkingLot(1));
        parkinglotList.add(new ParkingLot(1));
        parkinglotList.add(new ParkingLot(1));
    }

    public boolean parkCar(String carId) {
        for (ParkingLot p : parkinglotList) {
            if (p.parkCar(carId)) {
                return true;
            }
        }
        return false;
    }

    public String getCar(String carId) {
        for (ParkingLot p : parkinglotList) {
            String car = p.getCar(carId);
            if (car != null) {
                return car;
            }
        }
        return null;
    }
}
