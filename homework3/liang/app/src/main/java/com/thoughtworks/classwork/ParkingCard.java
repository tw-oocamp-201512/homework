package com.thoughtworks.classwork;

public class ParkingCard {
    private String cardNum;

    public ParkingCard(Car car) {
        cardNum = car.getCarNum();
    }

    public ParkingCard() {

    }

    public String getCardNum() {
        return cardNum;
    }
}
