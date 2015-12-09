package com.sunjin.parking;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jsun on 12/7/15.
 */
public class KingOfParkingLotTest {
    private KingOfParkingLot kingOfParkingLot;

    @Before
    public void setUp() throws Exception {
        List<ParkingLot> parkingLotList = new ArrayList<>();
        for (int i = 2; i < 5; i++) {
            parkingLotList.add(new ParkingLot(i));
        }
        kingOfParkingLot = new KingOfParkingLot(parkingLotList);
    }

    @Test
    public void testCarInServiceSuccess() {
        String carNumber = "a";
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertNotNull(ticket);
        assertEquals(ticket.getCarNumber(), carNumber);
    }

    @Test
    public void testCarInServiceFailed() {
        ParkingLot parkingLot1 = new ParkingLot(2);
        parkingLot1.carIn("1");
        parkingLot1.carIn("2");
        ParkingLot parkingLot2 = new ParkingLot(2);
        parkingLot2.carIn("3");
        parkingLot2.carIn("4");
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);
        String carNumber = "a";
        KingOfParkingLot kingOfParkingLot = new KingOfParkingLot(parkingLots);
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertNull(ticket);
    }

    @Test public  void testCarOutServiceSuccess(){
        String carNumber = "a";
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertTrue(kingOfParkingLot.carOutService(ticket));
    }

}