package com.sunjin.taxi.calculator;

import com.sunjin.taxi.model.Order;

/**
 * Created by jsun on 12/2/15.
 */
public interface PriceCal {
    void calculate(Order order);
}
