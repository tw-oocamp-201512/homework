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
    List<ParkingLot> parkingLotList;
    List<ParkingLot> parkingLotList2;

    @Before
    public void setUp() throws Exception {
        parkingLotList = new ArrayList<>();
        for (int i = 2; i < 5; i++) {
            parkingLotList.add(new ParkingLot(i));
        }
        ParkingLot parkingLot1 = new ParkingLot(2);
        parkingLot1.carIn("1");
        parkingLot1.carIn("2");
        ParkingLot parkingLot2 = new ParkingLot(2);
        parkingLot2.carIn("3");
        parkingLot2.carIn("4");
        parkingLotList2 = new ArrayList<>();
        parkingLotList2.add(parkingLot1);
        parkingLotList2.add(parkingLot2);
    }

    @Test
    public void testCarInServiceSuccess() {
        KingOfParkingLot kingOfParkingLot;
        kingOfParkingLot = new KingOfParkingLot(parkingLotList);
        String carNumber = "a";
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertNotNull(ticket);
        assertEquals(ticket.getCarNumber(), carNumber);
    }

    @Test
    public void testCarInServiceFailed() {
        String carNumber = "a";
        KingOfParkingLot kingOfParkingLot = new KingOfParkingLot(parkingLotList2);
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertNull(ticket);
    }

    @Test
    public  void testCarOutServiceSuccess(){
        KingOfParkingLot kingOfParkingLot = new KingOfParkingLot(parkingLotList);
        String carNumber = "a";
        Ticket ticket = kingOfParkingLot.carInService(carNumber);
        assertTrue(kingOfParkingLot.carOutService(ticket));
    }

    @Test
    public  void testCarOutServiceFailed(){
        KingOfParkingLot kingOfParkingLot = new KingOfParkingLot(parkingLotList);
        Ticket ticket = new Ticket("a");
        assertFalse(kingOfParkingLot.carOutService(ticket));
    }

}