package com.tw;

public class Length {

    private double value;
    private final Unit unit;
    private final double displayValue;

    public Length(double displayValue, String unit) {

        this.displayValue = displayValue;
        this.unit = Unit.valueOf(unit);
        this.value = this.unit.getValue(displayValue);
    }

    public Length multiply(int constant) {
        return new Length(displayValue * constant, unit.toString());
    }

    public Length divide(int constant) {
        return new Length(displayValue / constant, unit.toString());
    }

    public Length getMMLength() {
        return new Length(value, "mm");
    }

    public Length getCMLength() {
        return new Length(value / 10, "cm");
    }

    public Length getMLength() {
        return new Length(value / 1000, "m");
    }

    public Length add(Length other) {
        return new Length(unit.getDisplayValue(this.value + other.value), unit.toString());
    }

    public Length subtract(Length other) {
        return new Length(unit.getDisplayValue(this.value - other.value), unit.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length otherLength = (Length)obj;
            return value == otherLength.value;
        } else {
            return false;
        }
    }
}
