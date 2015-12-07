package com.tw.xqcao;

public class Length {

    private double value;
    private LengthUnit unitType;

    public Length(double value, LengthUnit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public void plus(Length otherLength) {
        this.value = (this.getMillimeterValue() + otherLength.getMillimeterValue()) / this.unitType.getValue();
    }

    public void minus(Length otherLength) {
        this.value = (this.getMillimeterValue() - otherLength.getMillimeterValue()) / this.unitType.getValue();
    }

    public void multiply(double number) {
        this.value *= number;
    }

    public void divide(double number) {
        this.value /= number;
    }

    public double getMillimeterValue() {
        return this.value * this.unitType.getValue();
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
