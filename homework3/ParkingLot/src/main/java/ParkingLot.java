import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdlian on 12/7/15.
 */
public class ParkingLot {

    private int capacity;

    private List<String> cars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        cars = new ArrayList<String>();
    }

    public boolean park(String car) {
        if (cars.size() < capacity) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public String getCar(String car){
        if (cars.remove(car)) {
            return car;
        }
        return null;
    }

}
