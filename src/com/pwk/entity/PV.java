package com.pwk.entity;

import java.sql.Timestamp;

/**
 * Created by wenkai.peng on 1/21/2015.
 */
public class PV {
    private int id;
    private Timestamp createDate;
    private int pcCount;
    private int mobileCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public int getPcCount() {
        return pcCount;
    }

    public void setPcCount(int pcCount) {
        this.pcCount = pcCount;
    }

    public int getMobileCount() {
        return mobileCount;
    }

    public void setMobileCount(int mobileCount) {
        this.mobileCount = mobileCount;
    }
}
