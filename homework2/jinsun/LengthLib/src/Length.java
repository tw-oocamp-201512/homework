/**
 * Created by jsun on 12/3/15.
 */
public class Length {

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public void setUnit(LengthUnit unit) {
        this.unit = unit;
    }

    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return value * unit.getValue() == length.getValue() * length.getUnit().getValue();

    }

}

enum LengthUnit {
    M(1000),
    CM(10),
    MM(1);
    private final int value;

    LengthUnit(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}