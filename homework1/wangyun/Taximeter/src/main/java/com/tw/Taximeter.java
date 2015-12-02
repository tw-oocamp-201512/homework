package com.tw;

public class Taximeter {

    public static int calPrice(int distance, int waitTime) {
        return (int) Math.round(DistanceFeeCalculator.calPrice(distance) + WaitTimeFeeCalculator.calPrice(waitTime));
    }


}
