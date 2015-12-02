/**
 * Created by Qingbo on 12/2/15.
 */
public class taxiMeter {
    public static final double FLAG_DISTANCE = 2.0;
    public static final double FLAG_PRICE = 6;
    public static final double PRICE_PER_KM = 0.8;
    public static final double PRECISION = 0.001;
    public static final double  BASE_DISTANCE = 8.0;

    public double distanceFee(int distance) {
        if (distance > (FLAG_DISTANCE + PRECISION) ) {
            return FLAG_PRICE + (distance - FLAG_DISTANCE) * PRICE_PER_KM;
        } else {
            return FLAG_PRICE;
        }
    }
}
