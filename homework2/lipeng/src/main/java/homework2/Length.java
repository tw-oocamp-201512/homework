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
        return convertToM(this) == convertToM(that);
    }

    private double convertToM(Length that) {
        if (that.unit.equals("cm")) {
            return that.value / 100;
        }
        if (that.unit.equals("mm")) {
            return that.value / 1000;
        }
        return that.value;
    }

    @Override
    public String toString() {
        return value + unit;
    }
}
