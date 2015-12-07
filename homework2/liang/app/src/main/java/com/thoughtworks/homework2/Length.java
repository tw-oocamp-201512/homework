package com.thoughtworks.homework2;

public class Length {

    private float mmValue;

    public enum UNITS {MM, CM, M}

    public Length(float value, UNITS units) {
        mmValue = toMM(value, units);
    }

    public Length plus(Length length) {
        float num = mmValue + length.getValueWithMM();
        return new Length(num, UNITS.MM);
    }

    public Length minus(Length length) {
        float value = mmValue - length.getValueWithMM();
        return new Length(value, UNITS.MM);
    }

    public Length multiply(int target) {
        float value = mmValue * target;
        return new Length(value, UNITS.MM);
    }

    public Length division(int target) {
        float value = mmValue / target;
        return new Length(value, UNITS.MM);
    }

    public float getValueWithM() {
        return mmValue / 1000;
    }

    public float getValueWithCM() {
        return mmValue / 10;
    }

    public float getValueWithMM() {
        return mmValue;
    }

    private float toMM(final float value, final UNITS units) {
        switch (units) {
            case M:
                return value * 1000;
            case CM:
                return value * 10;
            default:
                return value;
        }
    }

    @Override
    public boolean equals(Object o) {
        Length request = ((Length) o);
        return mmValue == request.getValueWithMM();
    }
}
