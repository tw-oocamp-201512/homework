package com.sunjin.parking;

/**
 * Created by jsun on 12/7/15.
 */
public class Ticket {

    private String carNumber;

    public Ticket(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
