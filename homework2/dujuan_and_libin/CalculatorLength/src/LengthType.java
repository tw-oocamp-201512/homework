public enum LengthType {
    M(1000), CM(10), MM(1);

    private final int baseNum;

    LengthType(int baseNum) {
        this.baseNum = baseNum;
    }

    public int getBaseNum() {
        return this.baseNum;
    }
}
