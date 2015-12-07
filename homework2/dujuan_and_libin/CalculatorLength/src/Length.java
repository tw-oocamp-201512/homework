public class Length {

    private final double num;
    private final LengthType type;
    private static final LengthCalculator calculator = new LengthCalculator();

    public Length(double num, LengthType type) {
        this.num = num;
        this.type = type;
    }

    public LengthType getType() {
        return type;
    }

    public double getBaseNum() {
        return type.getBaseNum() * this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Length && this.getBaseNum() == ((Length) obj).getBaseNum();
    }

    public Length add(Length length){
        return calculator.add(this, length);
    }

    public Length subtract(Length length){
        return calculator.subtract(this, length);
    }

    public Length multiply(double num){
        return calculator.multiply(this, num);
    }

    public Length divide(double num){
        return calculator.divide(this, num);
    }

    public Length transfer(LengthType type){
        return new Length(this.getBaseNum() / type.getBaseNum(), type);
    }

    @Override
    public String toString(){
        return this.num + this.type.toString();
    }

}
