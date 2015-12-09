package com.sunjin.parking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Created by jsun on 12/7/15.
 */
public class ParkingLotTest {
    ParkingLot parkingLot;

    @Before
    public void beforeTest() {
        parkingLot = new ParkingLot(5);
    }

    @Test
    public void testCarInSuccess() {
        String carNumber = "aaa";
        Ticket ticket = parkingLot.carIn(carNumber);
        assertNotNull(ticket);
        assertEquals(ticket.getCarNumber(), carNumber);
    }

    @Test
    public void testCarInFailed() {
        for (int i = 0; i <= 5; i++) {
            String carNumber = "aaa" + i;
            parkingLot.carIn(carNumber);
        }
        assertNull(parkingLot.carIn("bbb"));
    }

    @Test
    public void testCarOut() {
        String carNumber = "bbb";
        Ticket ticket = parkingLot.carIn(carNumber);
        assertTrue(parkingLot.carOut(ticket));
    }

    @Test
    public void testCarOutFailed() {
        String carNumber = "bbb";
        Ticket ticket = parkingLot.carIn(carNumber);
        assertFalse(parkingLot.carOut(ticket));
    }
}
