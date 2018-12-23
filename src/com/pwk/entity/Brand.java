package com.pwk.entity;
import java.util.HashSet;
import java.util.Set;

public class Brand {
    private Integer id;
    private String brandName;
    Set<Image> picPath = new HashSet<Image>();
    private int position;
    private int status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Image> getPicPath() {
        return picPath;
    }

    public void setPicPath(Set<Image> picPath) {
        this.picPath = picPath;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
