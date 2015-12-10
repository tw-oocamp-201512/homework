package com.thoughtworks;

/**
 * Created by rdlian on 12/3/15.
 */
public class TexiMeter {

    private double flagPrice = 6;

    private double charge;

    private double waitingUnitPrice = 0.25;

    public long getCharge(float distance, int stopWaitingTime) {

        charge = flagPrice;

        if (distance > 2) {
            charge += calculateChargePerKilometer(distance);
        }

        if (distance > 8) {
            charge += calculateExtraChargePerKilometer(distance);
        }

        return Math.round(charge + stopWaitingTime * waitingUnitPrice);
    }

    private double calculateChargePerKilometer(float distance) {
        return (distance - 2) * 0.8;
    }

    private double calculateExtraChargePerKilometer(float distance) {
        return (distance - 8) * 0.4;
    }
}
