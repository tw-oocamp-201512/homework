package com.tw;

public class Length {
    private String unit;
    private int value;

    public Length(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        Length otherLength = (Length) other;
        if (this.unit.equals(otherLength.getUnit())) {
            return this.value == otherLength.getValue();
        } 
        return false;
    }
}
