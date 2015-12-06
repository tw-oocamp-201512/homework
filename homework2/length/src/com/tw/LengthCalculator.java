package com.tw;

public class LengthCalculator {
    public Length add(Length length1, Length length2) {
        double baseValue = length1.convertToBaseValue() + length2.convertToBaseValue();
        return createLengthByBaseValue(baseValue);
    }

    public Length minus(Length length1, Length length2) {
        double baseValue = length1.convertToBaseValue() - length2.convertToBaseValue();
        return createLengthByBaseValue(baseValue);
    }

    public Length multiple(Length length, int multiplier) {
        double baseValue = length.convertToBaseValue() * multiplier;
        return createLengthByBaseValue(baseValue);
    }

    public Length divide(Length length, int divider) {
        double baseValue = length.convertToBaseValue() / divider;
        return createLengthByBaseValue(baseValue);
    }

    private Length createLengthByBaseValue(double baseValue) {
        return new Length(baseValue, Unit.getBaseUnit());
    }
}
