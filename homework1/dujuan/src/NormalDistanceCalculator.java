public class NormalDistanceCalculator implements DistanceCalculator {

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice + (distance - DistanceManager.flagDistance) * DistanceManager.pricePerKilometer;
    }
}
