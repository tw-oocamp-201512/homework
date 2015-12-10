package com.tw;

public enum Unit {
    M(1000), CM(10), MM(1);
    
    private final int value;

    Unit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    static public Unit getBaseUnit() {
        return MM;
    }
}
