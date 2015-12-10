/**
 * Created by rdlian on 12/7/15.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void shouldBeAbleToParkCarWhenLotHasSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(5);
        assertEquals(true, parkingLot.park("car"));
    }

    @Test
    public void shouldNotBeAbleToParkWhenParkingLotHasNoSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park("car");
        assertEquals(false, parkingLot.park("car2"));
    }

    @Test
    public void shouldBeAbleToGetCarWhenLotHasYourCar() throws Exception {
        ParkingLot parkingLot = new ParkingLot(5);
        parkingLot.park("car");
        assertEquals("car", parkingLot.getCar("car"));
    }
}
