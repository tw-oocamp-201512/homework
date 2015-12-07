package com.oocamp;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LengthTest {
    private Length oneM = new Length(1, Length.Unit.M);
    private Length tenMm = new Length(10, Length.Unit.MM);
    private Length tenCm = new Length(10, Length.Unit.CM);

    @Test
    public void one_hundred_cm_should_be_equals_to_one_m() {
        assertThat(new Length(100, Length.Unit.CM), is(oneM));
    }

    @Test
    public void ten_mm_should_be_equals_to_one_cm() {
        Length oneCm = new Length(1, Length.Unit.CM);
        assertThat(tenMm, is(oneCm));
    }

    @Test
    public void ten_mm_can_transform_to_one_cm() {
        Length oneCm = tenMm.transFormTo(Length.Unit.CM);
        assertThat(oneCm.toString(), is("1.0 CM"));
    }

    @Test
    public void ten_mm_add_one_m_equals_1010mm() {
        Length tenMm = new Length(10, Length.Unit.MM);
        Length oneHundredTenMm = new Length(1010, Length.Unit.MM);
        assertThat(tenMm.add(oneM), is(oneHundredTenMm));
    }

    @Test
    public void one_m_minus_ten_mm_equals_990mm() {
        Length tenMm = new Length(10, Length.Unit.MM);
        assertThat(oneM.minus(tenMm), is(new Length(990, Length.Unit.MM)));
    }

    @Test
    public void one_m_multiply_3_equals_three_m() {
        assertThat(oneM.multiply(3), is(new Length(3, Length.Unit.M)));
    }

    @Test
    public void one_m_divide_4_equals_one_quart_m() {
        assertThat(oneM.divide(4), is(new Length(0.25, Length.Unit.M)));
    }

    @Test
    public void combine_calculation_operation_should_get_545mm() {
        assertThat(oneM.divide(4).add(tenCm.multiply(3)).minus(new Length(5, Length.Unit.MM)).toString(), is("545.0 MM"));
    }
}
