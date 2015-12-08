package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void testLengthEqual() {
        Length oneLength = new Length(1, "m");
        Length otherLength = new Length(100, "mm");

        assertTrue(oneLength.equals(otherLength));
    }

    @Test
    public void testMultiConstant() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.multiConstant(2).equals(new Length(200, "mm")));
    }

    @Test
    public void testDivideConstant() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.divideConstant(2).equals(new Length(50, "mm")));
    }

    @Test
    public void testGetMMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getMMLength().equals(new Length(200, "mm")));
    }

    @Test
    public void testGetCMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getCMLength().equals(new Length(20, "cm")));
    }

    @Test
    public void testGetMLength() {
        Length oneLength = new Length(200, "mm");

        assertTrue(oneLength.getMLength().equals(new Length(2, "m")));
    }

    @Test
    public void testAddAnotherLength() {
        Length oneLength = new Length(200, "mm");
        Length otherLength = new Length(15, "m");

        assertTrue(oneLength.addAnotherLength(otherLength).equals(new Length(17, "m")));
    }

    @Test
    public void testSubtractAnotherLength() {
        Length oneLength = new Length(200, "mm");
        Length otherLength = new Length(1, "cm");

        assertTrue(oneLength.subtractAnotherLength(otherLength).equals(new Length(190, "mm")));
    }
}