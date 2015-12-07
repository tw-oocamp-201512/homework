package com.oocamp;

import java.math.BigDecimal;

public class Length {
    private final double value;
    private final Unit unit;

    public Length add(Length length) {
        return new Length(getMMValue().add(length.getMMValue()).doubleValue(), Unit.MM);
    }

    public Length minus(Length length) {
        return new Length(getMMValue().add(length.getMMValue().negate()).doubleValue(), Unit.MM);
    }

    public Length multiply(double i) {
        BigDecimal thisValue = getMMValue();
        return new Length(thisValue.multiply(BigDecimal.valueOf(i)).doubleValue(), Unit.MM);
    }

    public Length divide(double i) {
        return new Length(getMMValue().divide(BigDecimal.valueOf(i)).doubleValue(), Unit.MM);
    }

    public Length transFormTo(Unit unit) {
        return new Length(getMMValue().divide(BigDecimal.valueOf(unit.getTimes())).doubleValue(), unit);
    }

    public enum Unit {
        CM(10), M(1000), MM(1);

        private final int times;

        Unit(int i) {
            this.times = i;
        }

        public int getTimes() {
            return times;
        }
    }

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length that = (Length) obj;
            return that.getMMValue().equals(this.getMMValue());
        }
        return false;
    }

    private BigDecimal getMMValue() {
        return BigDecimal.valueOf(this.value * this.unit.getTimes());
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.value, this.unit);
    }
}
