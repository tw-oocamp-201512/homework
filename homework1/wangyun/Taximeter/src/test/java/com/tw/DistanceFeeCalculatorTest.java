package com.tw;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/2/15.
 */
public class DistanceFeeCalculatorTest {


    @Test
    public void distanceLessThan2KM() {
        Assert.assertEquals(0, DistanceFeeCalculator.calPrice(0), 0.01);
        Assert.assertEquals(6, DistanceFeeCalculator.calPrice(1), 0.01);
        Assert.assertEquals(6, DistanceFeeCalculator.calPrice(2), 0.01);
    }

    @Test
    public void distanceMoreThan2KMLessThan8Km() {
        Assert.assertEquals(6.8, DistanceFeeCalculator.calPrice(3), 0.01);
        Assert.assertEquals(10.8, DistanceFeeCalculator.calPrice(8), 0.01);
    }

    @Test
    public void distanceMoreThan8Km() {
        Assert.assertEquals(12, DistanceFeeCalculator.calPrice(9), 0.01);
        Assert.assertEquals(25.2, DistanceFeeCalculator.calPrice(20), 0.01);
    }

}