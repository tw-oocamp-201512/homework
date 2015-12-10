package com.tw.parkinglot;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingHelperTest {


    @Test
    public void testParkOneCarSuccess() {
        ParkingHelper helper = new ParkingHelper();
        boolean isParked = helper.parkCar("S1");
        assertThat(isParked, is(true));
    }

    @Test
    public void testParkOneCarFail() {
        ParkingHelper helper = new ParkingHelper();
        helper.parkCar("S1");
        helper.parkCar("S2");
        helper.parkCar("S3");
        boolean isParked = helper.parkCar("S4");
        assertThat(isParked, is(false));
    }

    @Test
    public void testGetOneCarSuccess() {
        ParkingHelper helper = new ParkingHelper();
        helper.parkCar("s1");
        String car = helper.getCar("s1");
        assertThat(car, is("s1"));
    }
    @Test
    public void testGetOneCarFailed() {
        ParkingHelper helper = new ParkingHelper();
        helper.parkCar("s1");
        String car = helper.getCar("s2");
        assertThat(car, nullValue());
    }

}
