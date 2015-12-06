package com.tw;

public class LengthCalculator {
    public Length add(Length length1, Length length2) {
        int baseValue = length1.convertToBaseValue() + length2.convertToBaseValue();
        return new Length(baseValue, Unit.getBaseUnit());
    }

    public Length minus(Length length1, Length length2) {
        int baseValue = length1.convertToBaseValue() - length2.convertToBaseValue();
        return new Length(baseValue, Unit.getBaseUnit());
    }
}
