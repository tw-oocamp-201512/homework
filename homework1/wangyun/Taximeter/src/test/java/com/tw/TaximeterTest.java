package com.tw;

import org.junit.Assert;
import org.junit.Test;

public class TaximeterTest {

    @Test
    public void distanceLessThan2KM() {
        Assert.assertEquals(0, Taximeter.calPrice(0, 0));
        Assert.assertEquals(6, Taximeter.calPrice(1, 0));
        Assert.assertEquals(6, Taximeter.calPrice(2, 0));
        Assert.assertEquals(6, Taximeter.calPrice(1, 1));
        Assert.assertEquals(7, Taximeter.calPrice(1, 2));
    }

    @Test
    public void distanceMoreThan2KMLessThan8Km() {
        Assert.assertEquals(7, Taximeter.calPrice(3, 2));
        Assert.assertEquals(12, Taximeter.calPrice(8, 3));
    }

    @Test
    public void distanceMoreThan8Km() {
        Assert.assertEquals(12, Taximeter.calPrice(9, 0));
        Assert.assertEquals(16, Taximeter.calPrice(12, 3));
    }

}