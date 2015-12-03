package com.tw;

import java.math.BigDecimal;

public class Taximeter {

    public double calculateByDistance(double distance) {
        if (distance <= 2000) {
            return 6;
        } else if (distance < 8000) {
            return 6 + (distance - 2000) / 1000 * 0.8;
        }
        return 6 + 4.8 + (distance - 8000) / 1000 * 1.2;
    }

    public double calculateByTime(int min) {
        return min * 0.25;
    }

    public double getRoundingResult(double origin) {
        BigDecimal temp = new BigDecimal(origin);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double getFinalCharge(double distance, int min) {
        double temp = calculateByDistance(distance) + calculateByTime(min);
        return getRoundingResult(temp);
    }
}
