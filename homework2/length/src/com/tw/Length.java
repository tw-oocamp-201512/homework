package com.tw;

public class Length {
    private Unit unit;
    private double value;
    private static final LengthCalculator calculator = new LengthCalculator();

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double convertToBaseValue() {
        return this.value * this.unit.getValue();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Length) {
            Length otherLength = (Length) other;
            return this.convertToBaseValue() == otherLength.convertToBaseValue();
        }
        return false;
    }

    public Length add(Length other) {
        return calculator.add(this, other);
    }

    public Length minus(Length other) {
        return calculator.minus(this, other);
    }

    public Length multiple(int multiplier) {
        return calculator.multiple(this, multiplier);
    }

    public Length divide(int divider) {
        return calculator.divide(this, divider);
    }
}
