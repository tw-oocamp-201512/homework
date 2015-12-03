public class ExtraDistanceCalculator implements DistanceCalculator {

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice + (DistanceManager.extraChargeDistance - DistanceManager.flagDistance) * DistanceManager.pricePerKilometer +
                (DistanceManager.pricePerKilometer + DistanceManager.extraPricePerKilometer) * (distance - DistanceManager.extraChargeDistance);
    }
}
