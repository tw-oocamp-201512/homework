import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TakeTaxiTest {
    @Test
    public void lessTwoKilometresExpression() {
        TakeTaxi take_taxi1 = new TakeTaxi(2.00, 2.00);
        assertEquals(7, take_taxi1.chargeMoney());
    }

    @Test
    public void twoToEightKilometersExpression() {
        TakeTaxi take_taxi2 = new TakeTaxi(4.00, 3.00);
        assertEquals(8, take_taxi2.chargeMoney());
    }

    @Test
    public void eightKilometersExpression() {
        TakeTaxi take_taxi3 = new TakeTaxi(8.00, 4.00);
        assertEquals(12, take_taxi3.chargeMoney());
    }

    @Test
    public void moreThanEightKilometersExpression() {
        TakeTaxi take_taxi4 = new TakeTaxi(10.00, 10.00);
        assertEquals(16, take_taxi4.chargeMoney());
    }

}