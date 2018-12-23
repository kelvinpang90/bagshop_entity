package com.pwk.entity;

import org.hibernate.annotations.Entity;

/**
 * Created by Administrator on 2015/4/21.
 */
@Entity
public class Parameter {
    private int id;
    private String name;
    private int attributeId;
    private float additionalPrice;

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

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    public float getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(float additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
