import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExtraDistanceCalculatorTest {

    @Test
    public void testCount() {
        int distance = 10;
        ExtraDistanceCalculator extraPriceCalculator = new ExtraDistanceCalculator();
        assertThat(extraPriceCalculator.count(distance), is(14.80));
    }
}