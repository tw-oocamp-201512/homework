/**
 * Created by wlniu on 05/12/15.
 */
public class Length {

    private double value;

    private LengthUnit lengthUnit;

    public Length() {

    }

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getLengthUnit() {
        return lengthUnit;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setLengthUnit(LengthUnit lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    public boolean equalTo(Length newLength) {
        return (this.getValue() * this.lengthUnit.getRatio()) == (newLength.getValue() * newLength.getLengthUnit().getRatio());
    }

    public Length convert(LengthUnit lengthUnit) {
        Length newLength = new Length();
        newLength.setLengthUnit(lengthUnit);
        double ratio = this.getLengthUnit().getRatio() / lengthUnit.getRatio();
        newLength.setValue(this.getValue() * ratio);
        return newLength;
    }

    public Length addInSameUnits(Length newLength) {
        Length lengthSum = new Length();
        lengthSum.setValue(this.getValue() + newLength.getValue());
        lengthSum.setLengthUnit(this.lengthUnit);
        return lengthSum;
    }

    public Length addInDiffUnits(Length newLength, LengthUnit lengthUnit) {
        return (this.convert(lengthUnit)).addInSameUnits(newLength.convert(lengthUnit));
    }


    public Length subtractInSameUnits(Length newLength) {
        Length lengthSum = new Length();
        lengthSum.setValue(this.getValue() - newLength.getValue());
        lengthSum.setLengthUnit(this.lengthUnit);
        return lengthSum;
    }

    public Length subtractInDiffUnits(Length newLength, LengthUnit lengthUnit) {
        return (this.convert(lengthUnit)).subtractInSameUnits(newLength.convert(lengthUnit));
    }

    public Length multiply(int multiplier) {
        Length lengthSum = new Length();
        lengthSum.setValue(this.value * multiplier);
        lengthSum.setLengthUnit(this.lengthUnit);
        return lengthSum;
    }

    public Length divide(int divisor) {
        Length lengthSum = new Length();
        lengthSum.setValue(this.value / divisor);
        lengthSum.setLengthUnit(this.lengthUnit);
        return lengthSum;
    }
}
