import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaximeterTest {

    private Taximeter taximeter;

    @Before
    public void setup() {
        taximeter = new Taximeter();
    }

    @Test
    public void shouldReturnFlagPrice() {
        int distance = 1;
        assertThat(taximeter.getPrice(distance, 0), is(6));
    }

    @Test
    public void shouldReturnPriceWith3KmDistance() {
        int distance = 3;
        assertThat(taximeter.getPrice(distance, 0), is(7));
    }

    @Test
    public void shouldReturnPriceWith9KmDistance() {
        int distance = 9;
        assertThat(taximeter.getPrice(distance, 0), is(12));
    }

    @Test
    public void shouldReturnPriceWith9KmDistanceAnd2MinStopWaiting() {
        int distance = 9;
        int waitingTime = 2;
        assertThat(taximeter.getPrice(distance, waitingTime), is(13));
    }
}
