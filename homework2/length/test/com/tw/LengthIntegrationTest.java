package com.tw;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthIntegrationTest {
    @Test
    public void testCalculateForLength() throws Exception {
        Length oneM = new Length(1, Unit.M);
        Length tenCM = new Length(10, Unit.CM);
        Length fiveCM = new Length(5, Unit.MM);
        
        Length resultLength = oneM.divide(4).add(tenCM.multiple(3)).minus(fiveCM);
        
        assertThat(new Length(545, Unit.MM), is(resultLength));
        assertThat(new Length(54.5, Unit.CM), is(resultLength));
        assertThat(new Length(0.545, Unit.M), is(resultLength));
    }
}
