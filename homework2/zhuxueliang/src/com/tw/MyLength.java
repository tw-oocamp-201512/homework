package com.tw;

public class MyLength {

    private double value;
    public String unite;
    public double displayValue;

    public MyLength(double displayValue, String unite) {

        this.displayValue = displayValue;
        if (unite.equals("mm")) {
            this.value = displayValue;
        } else if (unite.equals("cm")) {
            this.value = displayValue * 10;
        } else if (unite.equals("m")) {
            this.value = displayValue * 100;
        }
        this.unite = unite;
    }

    public MyLength multiConstant(int constant) {
        this.value *= constant;
        this.displayValue *= constant;
        return this;
    }

    public MyLength divideConstant(int constant) {
        this.value /= constant;
        this.displayValue /= constant;
        return this;
    }

    public MyLength getMMLength() {
        this.displayValue = value;
        this.unite = "mm";
        return this;
    }

    public MyLength getCMLength() {
        this.displayValue = value / 10;
        this.unite = "cm";
        return this;
    }

    public MyLength getMLength() {
        this.displayValue = value / 100;
        this.unite = "m";
        return this;
    }

    public MyLength addAnotherLength(MyLength other) {
        this.value += other.value;
        this.displayValue = calculateDisplayValue(this.unite, this.value);
        return this;
    }

    public MyLength subtractAnotherLength(MyLength other) {
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
            displayValue = value / 100;
        }
        return displayValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyLength) {
            MyLength otherLength = (MyLength)obj;
            return this.value == otherLength.value;
        } else {
            return false;
        }
    }
}
