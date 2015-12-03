package com.thoughtworks.oobootcamp1.model;

import com.thoughtworks.oobootcamp1.domain.Record;

import static com.thoughtworks.oobootcamp1.Rules.DISTANCE_FLAG;
import static com.thoughtworks.oobootcamp1.Rules.PRICE_FLAG;
import static com.thoughtworks.oobootcamp1.Rules.PRICE_PER_KILOMETER;

public class Taximeter {

    private Record record;
    private int charge;

    public void updateRecord(Record record) {
        this.record = record;
        update();
    }

    private void update() {
        charge = (int) (PRICE_FLAG + getKilometerCharge());
    }

    public int getCharge() {
        return charge;
    }

    public float getKilometerCharge() {
        float distance = record.getDistance();
        if (distance > DISTANCE_FLAG) {
            return (distance - DISTANCE_FLAG) * PRICE_PER_KILOMETER;
        }
        return 0;
    }
}