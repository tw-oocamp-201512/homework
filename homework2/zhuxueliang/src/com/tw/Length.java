package com.tw;

public class Length {

    private double value;
    public String unite;
    public double displayValue;

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

    public Length multiConstant(int constant) {
        this.value *= constant;
        this.displayValue *= constant;
        return this;
    }

    public Length divideConstant(int constant) {
        this.value /= constant;
        this.displayValue /= constant;
        return this;
    }

    public Length getMMLength() {
        this.displayValue = value;
        this.unite = "mm";
        return this;
    }

    public Length getCMLength() {
        this.displayValue = value / 10;
        this.unite = "cm";
        return this;
    }

    public Length getMLength() {
        this.displayValue = value / 1000;
        this.unite = "m";
        return this;
    }

    public Length addAnotherLength(Length other) {
        this.value += other.value;
        this.displayValue = calculateDisplayValue(this.unite, this.value);
        return this;
    }

    public Length subtractAnotherLength(Length other) {
        this.value -= other.value;
        this.displayValue = calculateDisplayValue(this.unite, this.value);
        return this;
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
