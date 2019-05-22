package com.yashodha.eirlssales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String itemname;
    private boolean itemavailability;
    private String dmethod;
    private String creditstatus;

    public Enquiry() {
    }

    public Enquiry(String itemname, boolean itemavailability, String dmethod, String creditstatus) {
        this.itemname = itemname;
        this.itemavailability = itemavailability;
        this.dmethod = dmethod;
        this.creditstatus = creditstatus;
    }


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public boolean isItemavailability() {
        return itemavailability;
    }

    public void setItemavailability(boolean itemavailability) {
        this.itemavailability = itemavailability;
    }

    public String getDmethod() {
        return dmethod;
    }

    public void setDmethod(String dmethod) {
        this.dmethod = dmethod;
    }

    public String getCreditstatus() {
        return creditstatus;
    }

    public void setCreditstatus(String creditstatus) {
        this.creditstatus = creditstatus;
    }


}
