public class LengthCalculator {
    public Length add(Length addend, Length augend) {
        double value = addend.getBaseNum() + augend.getBaseNum();
        return createLength(value);
    }

    public Length subtract(Length subtrahend, Length subtractor) {
        double value = subtrahend.getBaseNum() - subtractor.getBaseNum();
        return createLength(value);
    }

    public Length divide(Length length, double num) {
        return createLength(length.getBaseNum() / num);
    }

    public Length multiply(Length length, double num) {
        return createLength(length.getBaseNum() * num);
    }

    private Length createLength(double value) {
        return new Length(value, LengthType.MM);
    }
}
