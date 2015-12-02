package com.sunjin.taxi;

import com.sunjin.taxi.calculator.*;
import com.sunjin.taxi.model.Order;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by jsun on 12/2/15.
 */
public class TaxiFeeTest {
    Order order;

    @Before
    public void before() {
        order = new Order();
        order.setDistance(12);
        order.setTime(5);
    }

    @Test
    public void testCalculatePrice() {
        order.setDistance(12);
        order.setTime(5);
        TaxiFee taxiFee = new TaxiFee();
        taxiFee.calculate(order);
        assertEquals(17.0, order.getPrice());
    }

    @Test
    public void testStartPrice() {
        PriceCal startPriceCal = new StartPriceCal();
        startPriceCal.calculate(order);
        assertEquals(6.0, order.getPrice());
    }

    @Test
    public void testMiddlePrice() {
        PriceCal middlePriceCal = new MiddlePriceCal();
        middlePriceCal.calculate(order);
        assertEquals(4.8, order.getPrice());
    }

    @Test
    public void testExtraPrice() {
        PriceCal extraPriceCal = new ExtraPriceCal();
        extraPriceCal.calculate(order);
        assertEquals(4.8, order.getPrice());
    }

    @Test
    public void testTimePrice() {
        PriceCal timePriceCal = new TimePriceCal();
        timePriceCal.calculate(order);
        assertEquals(1.25, order.getPrice());
    }
}
