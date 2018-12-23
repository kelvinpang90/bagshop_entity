package com.pwk.entity;

import org.hibernate.annotations.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-10
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ShoppingCart {
    private int id;
    private Product product;
    private Color color;
    private User user;
    private int count;
    private String attributes;
    private Float additionalPrice;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Float getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(Float additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
