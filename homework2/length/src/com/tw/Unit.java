package com.tw;

public enum Unit {
    M(100), CM(1);
    
    private final int value;

    Unit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
