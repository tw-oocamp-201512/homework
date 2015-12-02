package com.sunjin.taxi.calculator;

import com.sunjin.taxi.model.Order;

/**
 * Created by jsun on 12/2/15.
 */
public class StartPriceCal implements PriceCal {
    @Override
    public void calculate(Order order) {
        order.setPrice(order.getPrice() + 6);
    }
}
