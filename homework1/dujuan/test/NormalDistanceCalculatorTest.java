import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NormalDistanceCalculatorTest {

    @Test
    public void testCount() {
        int distance = 6;
        DistanceCalculator calculator = new NormalDistanceCalculator();
        assertThat(calculator.count(distance), is(9.20));
    }

}