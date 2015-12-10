package com.thoughtworks.oobootcamp1.model;

import com.thoughtworks.oobootcamp1.Rules;
import com.thoughtworks.oobootcamp1.domain.Record;

import junit.framework.Assert;

import org.junit.Test;

public class TaximeterTest {

    @Test
    public void should_pay_flag_price_when_distance_elt_flag_distance() {
        float distance = Rules.DISTANCE_FLAG - 1;
        Record record = new Record();
        record.setDistance(distance);

        Taximeter taximeter = new Taximeter();
        taximeter.updateRecord(record);

        Assert.assertEquals(taximeter.getCharge(), Rules.PRICE_FLAG);
    }

    @Test
    public void should_not_pay_over_price_when_distance_elt_over_distance() {
        float distance = Rules.DISTANCE_OVER - 1;
        Record record = new Record();
        record.setDistance(distance);

        Taximeter taximeter = new Taximeter();
        taximeter.updateRecord(record);

        Assert.assertEquals(taximeter.getCharge(), (int) (Rules.PRICE_FLAG + (distance - Rules.DISTANCE_FLAG) * Rules.PRICE_PER_KILOMETER));
    }
}