package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TexiMeterTest {

    @Test
    public void shouldChargeFlagPriceWhenDistanceLessThanAndInlcude2() throws Exception {
        TexiMeter texiMeter = new TexiMeter();
        assertEquals(texiMeter.getCharge(1, 0), 6);
    }

    @Test
    public void shouldChargeByDistanceWhenDistanceMoreThan2AndNoMoreThan8() throws Exception {
        TexiMeter texiMeter = new TexiMeter();
        assertEquals(texiMeter.getCharge(4, 0), 8);
        assertEquals(texiMeter.getCharge(8, 0), 11);
    }

    @Test
    public void shouldChargeExtraPriceWhenDistanceMoreThan8() throws Exception {
        TexiMeter texiMeter = new TexiMeter();
        assertEquals(texiMeter.getCharge(10, 0), 13, 0.0001);
    }

    @Test
    public void shouldCalculateStopWaitingCharge() throws Exception {
        TexiMeter texiMeter = new TexiMeter();
        assertEquals(texiMeter.getCharge(10, 2), 14, 0.0001);
    }

    @Test
    public void shouldGetRoundCharge() throws Exception {
        TexiMeter texiMeter = new TexiMeter();
        assertEquals(texiMeter.getCharge(10, 2), 14, 0.0001);
    }
}