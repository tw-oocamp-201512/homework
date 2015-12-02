package com.sunjin.taxi;

import com.sunjin.taxi.calculator.*;
import com.sunjin.taxi.model.Order;

/**
 * Created by jsun on 12/2/15.
 */

public class TaxiFee implements PriceCal {
    @Override
    public void calculate(Order order) {
        PriceCal startPriceCal = new StartPriceCal();
        PriceCal middlePriceCal = new MiddlePriceCal();
        PriceCal extraPriceCal = new ExtraPriceCal();
        PriceCal timePriceCal = new TimePriceCal();
        startPriceCal.calculate(order);
        middlePriceCal.calculate(order);
        extraPriceCal.calculate(order);
        timePriceCal.calculate(order);
        order.setPrice(Math.round(order.getPrice()));
    }
}
