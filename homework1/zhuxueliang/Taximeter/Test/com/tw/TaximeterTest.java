package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaximeterTest {

    private Taximeter meter;

    @Before
    public void setUp() throws Exception {
        meter = new Taximeter();
    }

    @Test
    public void testCalculateByDistance() throws Exception {
        assertEquals(6, meter.calculateByDistance(1500), 0);
    }
}