package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void test_1m_EqualTo_1000mm() {
        Length oneLength = new Length(1, "m");
        Length otherLength = new Length(1000, "mm");

        assertTrue(oneLength.equals(otherLength));
    }

    @Test
    public void test_1m_Multiply2_EqualTo_2000mm() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.multiply(2).equals(new Length(2000, "mm")));
    }

    @Test
    public void test_1m_Divide2_EqualTo_500mm() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.divide(2).equals(new Length(500, "mm")));
    }

    @Test
    public void testGetMMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getMMLength().equals(new Length(2000, "mm")));
    }

    @Test
    public void testGetCMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getCMLength().equals(new Length(200, "cm")));
    }

    @Test
    public void testGetMLength() {
        Length oneLength = new Length(2000, "mm");

        assertTrue(oneLength.getMLength().equals(new Length(2, "m")));
    }

    @Test
    public void test_2000mm_Add_15m_EqualTo_17m() {
        Length oneLength = new Length(2000, "mm");
        Length otherLength = new Length(15, "m");

        assertEquals(oneLength.add(otherLength), new Length(17, "m"));
    }

    @Test
    public void test_200mm_Subtract_1cm_EqualTo_190mm() {
        Length oneLength = new Length(200, "mm");
        Length otherLength = new Length(1, "cm");

        assertEquals(oneLength.subtract(otherLength), new Length(190, "mm"));
    }

    @Test
    public void testComplexCalculate() {
        Length result1 = new Length(1, "m").multiply(3);
        Length result2 = new Length(2, "m").divide(2);

        assertEquals(new Length(4000, "mm"), result1.add(result2));
    }
}