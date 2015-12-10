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

    public Length multiply(int number) {
        return new Length(value * number, unit);
    }

    public Length divide(int number) {
        return new Length(value / number, unit);
    }

    public Length add(Length that) {
        return new Length(convertToM() + that.convertToM(), Unit.m);
    }

    public Length minus(Length that) {
        return new Length(convertToM() - that.convertToM(), Unit.m);
    }
}
