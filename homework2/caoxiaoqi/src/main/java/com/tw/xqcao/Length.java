package com.tw.xqcao;

public class Length {

    private double value;

    public Length(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length otherLength = (Length)obj;
            return this.value == otherLength.value;
        } else {
            return super.equals(obj);
        }
    }
}
