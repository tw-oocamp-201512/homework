package com.tw;

public final class Length {

    private double value;
    private String unite;
    private double displayValue;

    public Length(double displayValue, String unite) {

        this.displayValue = displayValue;
        if (unite.equals("mm")) {
            this.value = displayValue;
        } else if (unite.equals("cm")) {
            this.value = displayValue * 10;
        } else if (unite.equals("m")) {
            this.value = displayValue * 1000;
        }
        this.unite = unite;
    }

    public Length multiply(int constant) {
        return new Length(this.displayValue * constant, this.unite);
    }

    public Length divide(int constant) {
        return new Length(this.displayValue / constant, this.unite);
    }

    public Length getMMLength() {
        return new Length(this.value, "mm");
    }

    public Length getCMLength() {
        return new Length(this.value / 10, "cm");
    }

    public Length getMLength() {
        return new Length(this.value / 1000, "m");
    }

    public Length add(Length other) {
        return new Length(calculateDisplayValue(this.unite, this.value + other.value), this.unite);
    }

    public Length subtract(Length other) {
        return new Length(calculateDisplayValue(this.unite, this.value - other.value), this.unite);
    }

    private double calculateDisplayValue(String unite, double value) {
        double displayValue = 0;
        if (unite.equals("mm")) {
            displayValue = value;
        } else if (this.unite.equals("cm")) {
            displayValue = value / 10;
        } else if (this.unite.equals("m")) {
            displayValue = value / 1000;
        }
        return displayValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            Length otherLength = (Length)obj;
            return this.value == otherLength.value;
        } else {
            return false;
        }
    }
}
