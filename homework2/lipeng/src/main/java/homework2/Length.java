package homework2;

public class Length {
    private final double value;
    private final String unit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length that = (Length) obj;
        if (that.unit.equals("cm")) {
            return value == that.value / 100;
        }
        if (that.unit.equals("mm")) {
            return value == that.value / 1000;
        }
        return value == that.value;
    }
}
