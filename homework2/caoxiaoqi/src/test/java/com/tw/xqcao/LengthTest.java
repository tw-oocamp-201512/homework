package com.tw.xqcao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void shouldEqualWhenUnitAndValueAreSame() {
        Length oneLength = new Length(1, LengthUnit.M);
        Length otherLength = new Length(1, LengthUnit.M);

        assertThat(oneLength.equals(otherLength), is(true));
    }

    @Test
    public void oneMetreShouldEqualOneHundredCentimeter() {
        Length oneLength = new Length(12.345, LengthUnit.M);
        Length otherLength = new Length(1234.5, LengthUnit.CM);

        assertThat(oneLength.equals(otherLength), is(true));
    }

    @Test
    public void oneCentimetreShouldEqualTenMillimeter() {
        Length oneLength = new Length(12.345, LengthUnit.CM);
        Length otherLength = new Length(123.45, LengthUnit.MM);

        assertThat(oneLength.equals(otherLength), is(true));
    }

    @Test
    public void shouldReturnCorrectLengthWhenPlusOneMeterLength() {
        Length oneLength = new Length(12.34, LengthUnit.M);
        Length otherLength = new Length(23.45, LengthUnit.M);
        
        oneLength.plusLength(otherLength);
        
        assertThat(oneLength.getMillimeterValue(), is(35790.0));
    }

    @Test
    public void shouldReturnCorrectLengthWhenPlusOneCentimeterLength() {
        Length oneLength = new Length(12.34, LengthUnit.M);
        Length otherLength = new Length(23.45, LengthUnit.CM);

        oneLength.plusLength(otherLength);

        assertThat(oneLength.getMillimeterValue(), is(12574.5));
    }

    @Test
    public void shouldReturnCorrectLengthWhenPlusOneMillimeterLength() {
        Length oneLength = new Length(12.34, LengthUnit.M);
        Length otherLength = new Length(23.45, LengthUnit.MM);

        oneLength.plusLength(otherLength);

        assertThat(oneLength.getMillimeterValue(), is(12363.45));
    }

    @Test
    public void shouldReturnCorrectLengthWhenSubOneMeterLength() {
        Length oneLength = new Length(23.45, LengthUnit.M);
        Length otherLength = new Length(12.34, LengthUnit.M);

        oneLength.subLength(otherLength);

        assertThat(oneLength.getMillimeterValue(), is(11110.0));
    }

    @Test
    public void shouldReturnCorrectLengthWhenSubOneCentimeterLength() {
        Length oneLength = new Length(23.45, LengthUnit.M);
        Length otherLength = new Length(12.34, LengthUnit.CM);

        oneLength.subLength(otherLength);

        assertThat(oneLength.getMillimeterValue(), is(23326.6));
    }

    @Test
    public void shouldReturnCorrectLengthWhenSubOneMillimeterLength() {
        Length oneLength = new Length(23.45, LengthUnit.M);
        Length otherLength = new Length(12.34, LengthUnit.MM);

        oneLength.subLength(otherLength);

        assertThat(oneLength.getMillimeterValue(), is(23437.66));
    }
}