package com.tw;

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
}
