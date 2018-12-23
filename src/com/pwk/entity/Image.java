package com.pwk.entity;

import org.hibernate.annotations.Entity;

import java.sql.Timestamp;

/**
 * Created by wenkai.peng on 9/19/2014.
 */
@Entity
public class Image {
    private int id;
    private String type; //图片属于哪个栏目
    private int parentId;   //父类对应item的id
    private String path;     //保存路径
    private String miniPath;     //mini保存路径
    private int index;     //排序
    private Timestamp createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMiniPath() {
        return miniPath;
    }

    public void setMiniPath(String miniPath) {
        this.miniPath = miniPath;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
