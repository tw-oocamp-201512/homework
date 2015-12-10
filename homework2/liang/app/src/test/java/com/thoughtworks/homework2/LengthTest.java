package com.thoughtworks.homework2;

import junit.framework.Assert;

import org.junit.Test;

public class LengthTest {

    @Test
    public void should_1m_eq_100cm() {
        Length length1 = new Length(1, Length.UNITS.M);
        Length length2 = new Length(100, Length.UNITS.CM);

        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void should_1m_plus_100cm_eq_2m() {
        Length result = new Length(2, Length.UNITS.M);

        Length length1 = new Length(1, Length.UNITS.M);
        Length length2 = new Length(100, Length.UNITS.CM);

        Assert.assertTrue(result.equals(length1.plus(length2)));
    }

    @Test
    public void should_1m_minus_10cm_eq_90cm() {
        Length result = new Length(90, Length.UNITS.CM);

        Length length1 = new Length(1, Length.UNITS.M);
        Length length2 = new Length(10, Length.UNITS.CM);

        Assert.assertTrue(result.equals(length1.minus(length2)));
    }

    @Test
    public void should_1m_multiply_10_eq_10m() {
        Length result = new Length(10, Length.UNITS.M);

        Length length = new Length(1, Length.UNITS.M);

        Assert.assertTrue(result.equals(length.multiply(10)));
    }

    @Test
    public void should_10m_division_10_eq_1m() {
        Length result = new Length(1, Length.UNITS.M);

        Length length = new Length(10, Length.UNITS.M);

        Assert.assertTrue(result.equals(length.division(10)));
    }
}