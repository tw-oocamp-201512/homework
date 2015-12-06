package com.tw.xqcao;

public class Length {

    private double value;
    private LengthUnit unitType;

    public Length(double value, LengthUnit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length otherLength = (Length)obj;
            return (this.value * this.unitType.getValue()) == (otherLength.value * otherLength.unitType.getValue());
        } else {
            return super.equals(obj);
        }
    }
}
