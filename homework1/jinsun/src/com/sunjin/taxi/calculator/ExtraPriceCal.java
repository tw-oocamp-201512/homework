package com.sunjin.taxi.calculator;

import com.sunjin.taxi.model.Order;

/**
 * Created by jsun on 12/2/15.
 */
public class ExtraPriceCal implements PriceCal {
    @Override
    public void calculate(Order order) {
        double extraPrice = order.getDistance() > 8 ? (order.getDistance() - 8) * 1.2 : 0;
        order.setPrice(order.getPrice() + extraPrice);
    }
}
