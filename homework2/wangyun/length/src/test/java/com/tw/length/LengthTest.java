package com.tw.length;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LengthTest {

    @Test
    public void one_m_should_be_equals_to_1000_mm() {
        assertThat(new Length("1", LengthUnit.M), is(new Length("1000", LengthUnit.MM)));
    }

    @Test
    public void one_cm_should_be_equals_to_10_mm() {
        assertThat(new Length("1", LengthUnit.CM), is(new Length("10", LengthUnit.MM)));
    }

    @Test
    public void should_get_right_result_in_add() {
        assertThat(new Length("1", LengthUnit.M).add(new Length("1", LengthUnit.MM)), is(new Length("1001", LengthUnit.MM)));
        assertThat(new Length("1", LengthUnit.CM).add(new Length("1", LengthUnit.MM)), is(new Length("11", LengthUnit.MM)));
        assertThat(new Length("0.1", LengthUnit.M).add(new Length("1", LengthUnit.MM)), is(new Length("101", LengthUnit.MM)));
    }

    @Test
    public void should_get_right_result_in_substract() {
        assertThat(new Length("1", LengthUnit.M).substract(new Length("1", LengthUnit.MM)), is(new Length("999", LengthUnit.MM)));
        assertThat(new Length("1", LengthUnit.CM).substract(new Length("1", LengthUnit.MM)), is(new Length("9", LengthUnit.MM)));
        assertThat(new Length("0.1", LengthUnit.M).substract(new Length("1", LengthUnit.MM)), is(new Length("99", LengthUnit.MM)));
    }

    @Test
    public void should_get_right_result_in_mutiply() {
        assertThat(new Length("1", LengthUnit.M).mutiply("0.99"), is(new Length("990", LengthUnit.MM)));
        assertThat(new Length("1", LengthUnit.CM).mutiply("8.5"), is(new Length("85", LengthUnit.MM)));
    }

    @Test
    public void should_get_right_result_in_devide() {
        assertThat(new Length("1", LengthUnit.M).devide("4"), is(new Length("250", LengthUnit.MM)));
    }

    @Test
    public void should_get_right_result_in_compose() {
        //1m / 4 + 10cm * 3 – 5mm = 555
        Length oneM = new Length("1", LengthUnit.M);
        Length firstPart = oneM.devide("4");
        Length tenCM = new Length("10", LengthUnit.CM);
        Length secondPart = tenCM.mutiply("3");
        Length thirdPart = new Length("5", LengthUnit.MM);

        assertThat(firstPart.add(secondPart).add(thirdPart), is(new Length("555.0", LengthUnit.MM)));
    }

}
