public class WaitingTimePriceCalculator implements TimeCalculator{
    @Override
    public double count(int waitingTime) {
        return DistanceManager.pricePerMin * waitingTime;
    }
}
