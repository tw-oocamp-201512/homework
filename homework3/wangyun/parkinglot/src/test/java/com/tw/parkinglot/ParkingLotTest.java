package com.tw.parkinglot;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingLotTest {
    
    @Test
    public void testParkOneCarSuccess() {
        ParkingLot parkingLot = new ParkingLot(1);
        boolean isparked = parkingLot.parkCar("陕A123");
        assertThat(isparked, is(true));
    }

    @Test
    public void testParkOneCarFailed() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar("陕A1");
        boolean isparkedTwo = parkingLot.parkCar("陕A2");
        assertThat(isparkedTwo, is(false));
    }

    @Test
    public void testGetOneCarSuccess() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar("陕A123");
        String car = parkingLot.getCar("陕A123");
        assertThat(car, is("陕A123"));
    }


    @Test
    public void testGetOneCarFailed() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar("陕A123");
        String car = parkingLot.getCar("陕A122");
        assertThat(car, nullValue());
    }
}
