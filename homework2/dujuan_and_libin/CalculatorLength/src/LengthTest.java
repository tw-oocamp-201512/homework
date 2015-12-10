import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

public class LengthTest {

    @Test
    public void should1MReturn1M() {
        Length OneM = new Length(1, LengthType.M);
        assertThat(OneM, is(new Length(1, LengthType.M)));
    }

    @Test
    public void should1MNotReturnObject() {
        Length OneM = new Length(1, LengthType.M);
        assertThat(OneM, is(not(new Object())));
    }

    @Test
    public void should1MReturn100CM() {
        Length OneM = new Length(1, LengthType.M);
        Length OneHundredCM = new Length(100, LengthType.CM);
        assertThat(OneM, is(OneHundredCM));
    }

    @Test
    public void should1MReturn1000MM() {
        Length OneM = new Length(1, LengthType.M);
        Length OneHundredCM = new Length(1000, LengthType.MM);
        assertThat(OneM, is(OneHundredCM));
    }

    @Test
    public void should1MAdd100CMReturn1100MM() {
        Length lengthOne = new Length(1, LengthType.M);
        Length lengthTwo = new Length(100, LengthType.MM);

        Length resultLength = lengthOne.add(lengthTwo);
        Length expectedLength = new Length(1100, LengthType.MM);

        assertThat(resultLength, is(expectedLength));
    }

    @Test
    public void should1MSubtract100CMReturn900MM() {
        Length lengthOne = new Length(1, LengthType.M);
        Length lengthTwo = new Length(100, LengthType.MM);
        assertThat(lengthOne.subtract(lengthTwo), is(new Length(90, LengthType.CM)));
    }

    @Test
    public void should10CMMultiply4Return400MM() {
        Length lengthOne = new Length(10, LengthType.CM);
        assertThat(lengthOne.multiply(4), is(new Length(400, LengthType.MM)));
    }

    @Test
    public void should10CMDivide4Return25MM() {
        Length lengthOne = new Length(10, LengthType.CM);
        assertThat(lengthOne.divide(4), is(new Length(25, LengthType.MM)));
    }

    @Test
    public void mixLengthCalculator(){
        // calculator 1m / 4 + 10cm * 3 – 5mm
        Length lengthOne = new Length(1, LengthType.M);
        Length lengthTwo = new Length(10, LengthType.CM);
        Length lengthThree = new Length(5, LengthType.MM);
        Length length = lengthOne.divide(4).add(lengthTwo.multiply(3)).subtract(lengthThree);
        assertThat(length, is(new Length(545, LengthType.MM)));
    }

    @Test
    public void transfer545MMToM(){
        Length lengthOne = new Length(545, LengthType.MM);
        Length lengthTwo = lengthOne.transfer(LengthType.M);
        assertThat(lengthTwo.getType(), is(LengthType.M));
    }

    @Test
    public void transferLengthToString(){
        Length length = new Length(54.5, LengthType.CM);
        assertThat(length.toString(), is("54.5CM"));
    }
}
