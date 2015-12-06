package homework2;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length that = (Length) obj;
        return convertToM() == that.convertToM();
    }

    private double convertToM() {
        return unit.convertToM(this.value);
    }

    @Override
    public String toString() {
        return value + unit.name();
    }
}
