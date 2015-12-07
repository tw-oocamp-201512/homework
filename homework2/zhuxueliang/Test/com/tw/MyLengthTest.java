package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLengthTest {

    @Test
    public void testLengthEqual() {
        MyLength oneLength = new MyLength(1, "m");
        MyLength otherLength = new MyLength(100, "mm");

        assertTrue(oneLength.equals(otherLength));
    }

    @Test
    public void testMultiConstant() {
        MyLength oneLength = new MyLength(1, "m");

        assertTrue(oneLength.multiConstant(2).equals(new MyLength(200, "mm")));
    }

    @Test
    public void testDivideConstant() {
        MyLength oneLength = new MyLength(1, "m");

        assertTrue(oneLength.divideConstant(2).equals(new MyLength(50, "mm")));
    }

    @Test
    public void testGetMMLength() {
        MyLength oneLength = new MyLength(2, "m");

        assertTrue(oneLength.getMMLength().equals(new MyLength(200, "mm")));
    }

    @Test
    public void testGetCMLength() {
        MyLength oneLength = new MyLength(2, "m");

        assertTrue(oneLength.getCMLength().equals(new MyLength(20, "cm")));
    }

    @Test
    public void testGetMLength() {
        MyLength oneLength = new MyLength(200, "mm");

        assertTrue(oneLength.getMLength().equals(new MyLength(2, "m")));
    }

    @Test
    public void testAddAnotherLength() {
        MyLength oneLength = new MyLength(200, "mm");
        MyLength otherLength = new MyLength(15, "m");

        assertTrue(oneLength.addAnotherLength(otherLength).equals(new MyLength(17, "m")));
    }

    @Test
    public void testSubtractAnotherLength() {
        MyLength oneLength = new MyLength(200, "mm");
        MyLength otherLength = new MyLength(1, "cm");

        assertTrue(oneLength.subtractAnotherLength(otherLength).equals(new MyLength(190, "mm")));
    }
}