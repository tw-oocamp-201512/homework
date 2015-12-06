package com.tw;

public class LengthCalculator {
    public Length add(Length length1, Length length2) {
        int baseValue = length1.convertToBaseValue() + length2.convertToBaseValue();
        return createLengthByBaseValue(baseValue);
    }

    public Length minus(Length length1, Length length2) {
        int baseValue = length1.convertToBaseValue() - length2.convertToBaseValue();
        return createLengthByBaseValue(baseValue);
    }

    public Length multiple(Length length, int multiplier) {
        int baseValue = length.convertToBaseValue() * multiplier;
        return createLengthByBaseValue(baseValue);
    }

    public Length divide(Length length, int divider) {
        int baseValue = length.convertToBaseValue() / divider;
        return createLengthByBaseValue(baseValue);
    }

    private Length createLengthByBaseValue(int baseValue) {
        return new Length(baseValue, Unit.getBaseUnit());
    }
}
