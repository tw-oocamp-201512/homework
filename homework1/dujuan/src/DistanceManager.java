public class DistanceManager {
    static final int flagDistance = 2;
    static final int extraChargeDistance = 8;
    static final double extraPricePerKilometer = 1.20;
    static final double flagPrice = 6.00;
    static final double pricePerKilometer = 0.80;
    static final double pricePerMin = 0.25;

    public double countPrice(int distance, int waitingTime) {
        return countDistancePrice(distance) + countTimePrice(waitingTime);
    }

    private double countDistancePrice(int distance) {
        if (distance < flagDistance) {
            return new FlagDistanceCalculator().count(distance);
        }
        else if (distance < extraChargeDistance) {
            return new NormalDistanceCalculator().count(distance);
        }
        else {
            return new ExtraDistanceCalculator().count(distance);
        }
    }

    private double countTimePrice(int waitingTime) {
        return new WaitingTimePriceCalculator().count(waitingTime);
    }

}
