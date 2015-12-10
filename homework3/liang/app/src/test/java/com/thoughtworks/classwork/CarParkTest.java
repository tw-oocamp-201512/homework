package com.thoughtworks.classwork;

import org.junit.Assert;
import org.junit.Test;

public class CarParkTest {

    @Test
    public void should_can_part_car_when_park_is_null() {
        CarPark parking = new CarPark(1);

        ParkingCard card = parking.part(new Car());

        Assert.assertNotNull(card);
    }

    @Test
    public void should_not_part_car_when_park_is_full() {
        CarPark parking = new CarPark(20);
        for (int i = 0; i < 20; i++) {
            parking.part(new Car());
        }

        ParkingCard card = parking.part(new Car());

        Assert.assertNull(card);
    }

    @Test
    public void should_can_take_car_when_card_valid() {
        CarPark parking = new CarPark(1);
        ParkingCard card = parking.part(new Car("A88888"));

        Car car = parking.take(card);

        Assert.assertNotNull(car);
    }

    @Test
    public void should_not_take_car_when_card_not_valid() {
        CarPark parking = new CarPark(1);

        Car car = parking.take(new ParkingCard());

        Assert.assertNull(car);
    }
}