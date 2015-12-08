package com.tw.length;

import java.math.BigDecimal;

public enum LengthUnit {
    MM(1),CM(10),M(1000);

    private final int times;

    public int getTimes() {
        return times;
    }

    LengthUnit(int times) {
        this.times = times;
    }

    public BigDecimal getBigDecimalTimes() {
        return new BigDecimal(times);
    }
}
