package com.tw.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingLot {
    private final int capabilities;
    private final List<String> carList = new ArrayList<>();

    public ParkingLot(int capabilities) {
        this.capabilities = capabilities;
    }

    public  boolean parkCar(String carID) {
        if (carList.size() == capabilities){
            return false;
        }

        return carList.add(carID);
    }

    public String getCar(String carID) {
        if(carList.remove(carID)){
            return carID;
        }
        return null;
    }
}
