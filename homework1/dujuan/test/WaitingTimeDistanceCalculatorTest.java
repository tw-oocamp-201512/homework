import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WaitingTimeDistanceCalculatorTest {
    @Test
    public void shouldCount() {
        int waitingTime = 10;
        WaitingTimePriceCalculator calculator = new WaitingTimePriceCalculator();
        assertThat(calculator.count(waitingTime), is(2.50));
    }
}