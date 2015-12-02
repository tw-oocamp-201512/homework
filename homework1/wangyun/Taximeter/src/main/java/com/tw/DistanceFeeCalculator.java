package com.tw;

public class DistanceFeeCalculator {

    public static final int FLAG_DISTANCE = 2;
    public static final int MAX_BASE_TRAIN_DISTANCE = 8;
    public static final int FLAG_PRICE = 6;
    public static final double MAX_BASE_TRAJIN_PRICE = 6 + 0.8 * 6;

    public static double calPrice(int distance) {
        if (distance <= 0) {
            return 0;
        } else if (distance <= FLAG_DISTANCE) {
            return FLAG_PRICE;
        } else if (distance <= MAX_BASE_TRAIN_DISTANCE) {
            return FLAG_PRICE + 0.8 * (distance - 2);
        } else {
            return MAX_BASE_TRAJIN_PRICE + 0.8 * 1.5 * (distance - 8);
        }
    }

}
