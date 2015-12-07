package com.tw.length;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Length {
    private final BigDecimal value;
    private final LengthUnit unit = LengthUnit.MM;

    public Length(String value, LengthUnit unit) {
        this.value = getBasicUnitLength(new BigDecimal(value), unit);
    }

    public Length(BigDecimal value, LengthUnit unit) {
        this.value = getBasicUnitLength(value, unit);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length that = (Length) obj;
            return this.value.equals(that.value);
        } else {
            return false;
        }
    }

    private BigDecimal getBasicUnitLength(BigDecimal oldVal, LengthUnit unit) {
        return oldVal.multiply(new BigDecimal(unit.getTimes())).setScale(10, RoundingMode.HALF_EVEN);
    }

    public Length add(Length length) {
        return new Length(this.value.add(length.value), LengthUnit.MM);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Length substract(Length length) {
        return new Length(this.value.subtract(length.value), LengthUnit.MM);
    }

    public Length mutiply(String num) {
        return new Length(this.value.multiply(new BigDecimal(num)), LengthUnit.MM);
    }

    public Length devide(String num) {
        return new Length(this.value.divide(new BigDecimal(num)), LengthUnit.MM);
    }
}
