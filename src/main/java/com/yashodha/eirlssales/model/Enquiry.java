package com.yashodha.eirlssales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid;
    private int id;
    private String customer;
    private String dmethod;
    private String ddate;
    private String status;
    private String orderstatus;
    private String customerreturns;

    public Enquiry() {
    }

    public Enquiry(int id, String customer, String dmethod, String ddate, String status, String orderstatus, String customerreturns) {
        this.id = id;
        this.customer = customer;
        this.dmethod = dmethod;
        this.ddate = ddate;
        this.status = status;
        this.orderstatus = orderstatus;
        this.customerreturns = customerreturns;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDmethod() {
        return dmethod;
    }

    public void setDmethod(String dmethod) {
        this.dmethod = dmethod;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getCustomerreturns() {
        return customerreturns;
    }

    public void setCustomerreturns(String customerreturns) {
        this.customerreturns = customerreturns;
    }
}
