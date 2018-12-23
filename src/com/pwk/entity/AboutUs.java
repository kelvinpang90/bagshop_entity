package com.pwk.entity;

import org.hibernate.annotations.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-12
 * Time: 下午9:25
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class AboutUs {
    private int id;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
