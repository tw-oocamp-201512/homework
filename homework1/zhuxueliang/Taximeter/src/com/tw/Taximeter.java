package com.tw;

import java.math.BigDecimal;

/**
 * Created by xlzhu on 12/3/15.
 */
public class Taximeter {

    public double calculateByDistance(double distance) {
        if (distance <= 2000) {
            return 6;
        }
        return 0;
    }

    public double getRoundingResult(double origin) {
        BigDecimal temp = new BigDecimal(origin);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
