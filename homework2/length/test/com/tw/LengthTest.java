package com.tw;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthTest {
    @Test
    public void test1MIs1M() throws Exception {
        Length oneM1 = new Length(1, "M");
        Length oneM2 = new Length(1, "M");
        assertThat(oneM1, is(oneM2));
    }
}
