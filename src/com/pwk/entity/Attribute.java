package com.pwk.entity;

import org.hibernate.annotations.Entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2015/4/21.
 */
@Entity
public class Attribute {
    private int id;
    private String name;
    private int pId;
    private Set<Parameter> parameters = new HashSet<Parameter>();

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

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public Set<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(Set<Parameter> parameters) {
        this.parameters = parameters;
    }
}
