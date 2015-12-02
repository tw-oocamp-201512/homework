package com.tw;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yunwang on 12/2/15.
 */
public class WaitTimeCalculatorFeeTest {

    @Test
    public void testCalPrice() throws Exception {
        Assert.assertEquals(0, WaitTimeFeeCalculator.calPrice(0), 0.01);
        Assert.assertEquals(0.75, WaitTimeFeeCalculator.calPrice(3), 0.01);
    }
}