package homework2;

public enum Unit {
    m(1), cm(100), mm(1000);

    final int rate;

    Unit(int rate) {
        this.rate = rate;
    }

    double convertToM(double value) {
        return value / rate;
    }
}
