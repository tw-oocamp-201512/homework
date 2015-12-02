package com.tw;

public class WaitTimeFeeCalculator {

    public static double calPrice(double waitTime) {

        if (waitTime <= 0) {
            return 0;
        }
        return waitTime * 0.25;
    }


}
