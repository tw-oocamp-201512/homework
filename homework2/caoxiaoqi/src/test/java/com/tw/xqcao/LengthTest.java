package com.tw.xqcao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void shouldEqualWhenValueIsSame() {
        Length oneLength = new Length(1);
        Length otherLength = new Length(1);

        assertThat(oneLength.equals(otherLength), is(true));
    }
}