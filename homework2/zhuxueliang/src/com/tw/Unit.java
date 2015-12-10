package com.tw;

enum Unit {
    m, cm, mm;

    public double getValue(double displayValue) {
        int rate = 1;
        if (this == cm) {
            rate = 10;
        } else if (this == m) {
            rate = 1000;
        }
        return displayValue * rate;
    }

    public double getDisplayValue(double value) {
        int rate = 1;
        if (this == cm) {
            rate = 10;
        } else if (this == m) {
            rate = 1000;
        }

        return value / rate;
    }
}
