package com.pwk.entity;

import org.hibernate.annotations.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-25
 * Time: 下午6:47
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Admin {
    private Integer id;
    private String loginName;
    private String password;
    private String bandAccount;
    private String email;
    private String contactNumber;
    private String fullName;
    private String contactPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBandAccount() {
        return bandAccount;
    }

    public void setBandAccount(String bandAccount) {
        this.bandAccount = bandAccount;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
