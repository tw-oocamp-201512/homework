package com.sunjin.taxi.model;

/**
 * Created by jsun on 12/2/15.
 */
public class Order {
    private int distance;
    private int time;
    private double price;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
