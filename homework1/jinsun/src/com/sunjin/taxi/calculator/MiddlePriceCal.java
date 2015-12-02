package com.sunjin.taxi.calculator;

import com.sunjin.taxi.model.Order;

/**
 * Created by jsun on 12/2/15.
 */
public class MiddlePriceCal implements PriceCal {
    @Override
    public void calculate(Order order) {
        double middlePrice = order.getDistance() <= 8 ? (order.getDistance() - 2) * 0.8 : 4.8;
        order.setPrice(order.getPrice() + middlePrice);
    }
}
