/**
 * Created by rdlian on 12/7/15.
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ParkingManTest {

    private ParkingMan parkingMan;
    public static final int NUM_OF_PARKING_LOT = 6;

    @Before
    public void setUp() throws Exception {
        parkingMan = new ParkingMan(NUM_OF_PARKING_LOT);
        for (int i = 1; i < NUM_OF_PARKING_LOT + 1; i++) {
            parkingMan.addParkingLotList(new ParkingLot(i));
        }
    }

    @Test
    public void shouldParkingCarToPotNotFullFirst() throws Exception {
        for (int i = 1; i < 4; i++) {
            parkingMan.park("car" + i);
        }
        List<ParkingLot> parkingLotList = parkingMan.getParkingLotList();
        for (int i = 0; i < 2; i++) {
            assertEquals(false, parkingLotList.get(i).park("car"));
        }
        assertEquals(true, parkingMan.park("car_test"));
    }

    @Test
    public void shouldNotBeAbleToParkCarWhenAllLotFull() throws Exception {
        for (int i = 1; i < 22; i++) {
            parkingMan.park("car" + i);
        }
        assertEquals(false, parkingMan.park("car_test"));
    }
}
