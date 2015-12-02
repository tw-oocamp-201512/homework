/**
 * Created by Qingbo on 12/2/15.
 */
public class taxiMeter {
    public static final double FLAG_DISTANCE = 2.0;
    public static final double FLAG_PRICE = 6;
    public static final double PRICE_PER_KM = 0.8;
    public static final double PRECISION = 0.001;
    public static final double  BASE_DISTANCE = 8.0;
    public static final double  LONG_DISTANCE_EXTRA_CHARGE = 0.5;
    public static final double PRICE_FOR_WAITING_PER_MIN = 0.25;

    public double distanceFee(int distance) {

        if (distance > (BASE_DISTANCE + PRECISION)) {
            return FLAG_PRICE + (8 - FLAG_DISTANCE) * PRICE_PER_KM + (distance - 8) * (PRICE_PER_KM * (1+LONG_DISTANCE_EXTRA_CHARGE) ) ;
        } else if (distance > (FLAG_DISTANCE + PRECISION) ) {
            return FLAG_PRICE + (distance - FLAG_DISTANCE) * PRICE_PER_KM;
        } else {
            return FLAG_PRICE;
        }
    }

    public double waitFee(int minutes) {
        return minutes * PRICE_FOR_WAITING_PER_MIN;
    }

    public double total(int distance, int minutes) {
        return Math.round(distanceFee(distance) + waitFee(minutes));
    }
}
