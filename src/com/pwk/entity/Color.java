package com.pwk.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-1-11
 * Time: 下午9:51
 * To change this template use File | Settings | File Templates.
 */
public class Color {
    private int id;
    private String name;
    Set<Image> picPath = new HashSet<Image>();
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
