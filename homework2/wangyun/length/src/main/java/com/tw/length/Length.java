package com.tw.length;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.tw.length.LengthUnit.*;

public final class Length {
    private final BigDecimal value;
    private final LengthUnit unit = MM;

    public Length(String value, LengthUnit unit) {
        this(new BigDecimal(value), unit);
    }

    public Length(BigDecimal value, LengthUnit unit) {
        this.value = getBasicUnitLength(value, unit);
    }

    @Override
    public boolean equals(Object obj) {
        Length that = (Length) obj;
        return this.value.equals(that.value);
    }

    private BigDecimal getBasicUnitLength(BigDecimal oldVal, LengthUnit unit) {
        return oldVal.multiply(unit.getBigDecimalTimes()).setScale(10, RoundingMode.HALF_EVEN);
    }

    public Length add(Length length) {
        return new Length(this.value.add(length.value), MM);
    }

    @Override
    public String toString() {
        return value.toString() + unit;
    }

    public Length substract(Length length) {
        return new Length(this.value.subtract(length.value), MM);
    }

    public Length mutiply(String num) {
        return new Length(this.value.multiply(new BigDecimal(num)), MM);
    }

    public Length devide(String num) {
        return new Length(this.value.divide(new BigDecimal(num)), MM);
    }
}
