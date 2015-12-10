public class TakeTaxi {
    private double distance;
    private double time;

    private static final double BASE_MONEY = 6.0;

    public TakeTaxi(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    public double lessTwoKilometres() {
        return BASE_MONEY;
    }

    public double twoToEightKilometers() {
        return BASE_MONEY + (this.distance - 2) * 0.80;
    }

    public double moreThanEightKilometers() {
        return BASE_MONEY + ((this.distance - 2) * 0.80) + ((this.distance - 8) * 0.40);
    }

    public double waitTimePayMoney() {
        return this.time * 0.25;
    }

    public double totalMoney() {
        double money = 0.00;
        if (this.distance <= 2.00) {
            money = lessTwoKilometres() + waitTimePayMoney();
        } else if (this.distance > 2.00 && this.distance <= 8.00) {
            money = twoToEightKilometers() + waitTimePayMoney();
        } else {
            money = moreThanEightKilometers() + waitTimePayMoney();
        }
        return money;
    }

    public int chargeMoney() {
        return (int) Math.round(totalMoney());
    }

    public void printChargeMoney() {
        System.out.println(chargeMoney());
    }

    public static void main(String[] args) {
        TakeTaxi take_taxi1 = new TakeTaxi(2.00, 2.00);  //7
        TakeTaxi take_taxi2 = new TakeTaxi(6.00, 2.00);  //10
        TakeTaxi take_taxi3 = new TakeTaxi(8.00, 5.00);  //12
        TakeTaxi take_taxi4 = new TakeTaxi(4.00, 3.00);  //8
        TakeTaxi take_taxi5 = new TakeTaxi(10.00, 10.00);  //16

        take_taxi1.printChargeMoney();
        take_taxi2.printChargeMoney();
        take_taxi3.printChargeMoney();
        take_taxi4.printChargeMoney();
        take_taxi5.printChargeMoney();
    }
} 