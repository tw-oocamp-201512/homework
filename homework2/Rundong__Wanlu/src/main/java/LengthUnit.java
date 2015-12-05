/**
 * Created by wlniu on 05/12/15.
 */
public enum LengthUnit {
    M(1000), CM(10), MM(1);

    private int ratio;

    LengthUnit(int ratio) {
        this.ratio = ratio;
    }

    public int getRatio() {
        return ratio;
    }
}
