import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdlian on 12/7/15.
 */
public class ParkingMan {

    private List<ParkingLot> parkingLotList;

    public ParkingMan(int numOfParkingLot) {
        parkingLotList = new ArrayList<ParkingLot>(numOfParkingLot);
    }

    public void addParkingLotList(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }

    public boolean park(String car) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (parkingLot.park(car)) return true;
        }
        return false;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }
}
