public class FlagDistanceCalculator implements DistanceCalculator {

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice;
    }
}
