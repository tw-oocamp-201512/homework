package com.sunjin.parking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsun on 12/7/15.
 */
public class ParkingLot {
    private int limit;
    private List<Ticket> sendedTickets;
    public ParkingLot(int limit) {
        this.limit = limit;
        sendedTickets = new ArrayList<Ticket>();
    }

    public Ticket carIn(String carNumber) {
        if (sendedTickets.size()<limit){
            Ticket ticket = new Ticket(carNumber);
            sendedTickets.add(ticket);
            return ticket;
        }
        return null;
    }

    public boolean carOut(Ticket ticket) {
        if (sendedTickets.contains(ticket)){
            sendedTickets.remove(ticket);
            return true;
        }
        return false;
    }
}
