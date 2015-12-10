package com.sunjin.parking;

import java.util.List;

/**
 * Created by jsun on 12/7/15.
 */
public class KingOfParkingLot {
    private List<ParkingLot> parkingLotList;

    public KingOfParkingLot(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public Ticket carInService(String carNumber) {
        Ticket ticket = null;
        for (ParkingLot parking:parkingLotList
             ) {
                ticket = parking.carIn(carNumber);
            if (null != ticket){
                break;
            }
        }
        return ticket;
    }

    public boolean carOutService(Ticket ticket) {
        for (ParkingLot parking: parkingLotList
             ) {
            if (parking.carOut(ticket)){
                return true;
            }
        }
        return false;
    }
}
