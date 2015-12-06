package com.tw;

public class Length {
    private Unit unit;
    private int value;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public int convertToBaseValue() {
        return this.value * this.unit.getValue();
    }

    @Override
    public boolean equals(Object other) {
        Length otherLength = (Length) other;
        return this.convertToBaseValue() == otherLength.convertToBaseValue();
    }
}
