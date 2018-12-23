package com.pwk.entity;

import org.hibernate.annotations.Entity;

import java.sql.Timestamp;

/**
 * Created by wenkai.peng on 1/21/2015.
 */
@Entity
public class PV_Detail {
    private int id;
    private Timestamp createDate;
    private String page;
    private String ip;
    private String device;

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

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
