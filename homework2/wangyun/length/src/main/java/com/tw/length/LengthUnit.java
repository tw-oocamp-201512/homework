package com.tw.length;

public enum LengthUnit {
    MM(1),CM(10),M(1000);

    private final int times;

    public int getTimes() {
        return times;
    }

    LengthUnit(int i) {
        this.times = i;
    }
}
