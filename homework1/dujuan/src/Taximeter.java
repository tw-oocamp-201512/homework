public class Taximeter {

    public int getPrice(int distance, int waitingTime) {
        DistanceManager distanceManager = new DistanceManager();
        double price = distanceManager.countPrice(distance, waitingTime);
        return getRoundPrice(price);
    }

    private int getRoundPrice(double price ) {
        return (int) Math.round(price);
    }
}
