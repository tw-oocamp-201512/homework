package com.tw.xqcao;

public enum LengthUnit {
    M(1000), CM(10), MM(1);

    private int value;

    private LengthUnit(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
