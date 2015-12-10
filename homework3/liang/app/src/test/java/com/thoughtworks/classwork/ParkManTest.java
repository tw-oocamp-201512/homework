package com.thoughtworks.classwork;

import junit.framework.Assert;

import org.junit.Test;

public class ParkManTest {

    @Test
    public void should_part_car_when_his_parking_is_null() {
        ParkMan man = new ParkMan();

        Car car = new Car("A88888");
        ParkingCard card = man.part(car);

        Assert.assertNotNull(card);
    }

    @Test
    public void should_not_part_car_when_his_parking_is_full() {
        ParkMan man = new ParkMan();
        for (int i = 0; i < 60; i++) {
            man.part(new Car());
        }

        Car car = new Car("A88888");
        ParkingCard card = man.part(car);

        Assert.assertNull(card);
    }
}