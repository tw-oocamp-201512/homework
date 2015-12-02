import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class taxiMeterTest {
    public taxiMeter Fee;
    public static final double DELTA = 0.003;

    @Before
    public void setUp() throws Exception{
        Fee = new taxiMeter();
    }

    @Test
    public void should_return_6_when_distance_is_2_km()  {
        assertEquals(6, Fee.distanceFee(2), DELTA);
    }

    @Test
    public void should_return_6_when_distance_is_3_km()  {
        assertEquals(6.8, Fee.distanceFee(3), DELTA);
    }

}