package com.pwk.entity;

import org.hibernate.annotations.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-2
 * Time: 下午2:38
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class IndexProduct {
    private int id;
    private Product product;
    private Integer position;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
