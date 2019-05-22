package com.yashodha.eirlssales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int tele;
    private String email;
    private String tradingname;
    private String mainlocation;
    private String deliverylocation;
    private String returnlocation;
    private String status;

    public Customer() {
    }

    public Customer(String name, int tele, String email, String tradingname, String mainlocation, String deliverylocation, String returnlocation, String status) {
        this.name = name;
        this.tele = tele;
        this.email = email;
        this.tradingname = tradingname;
        this.mainlocation = mainlocation;
        this.deliverylocation = deliverylocation;
        this.returnlocation = returnlocation;
        this.status = status;
    }

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

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTradingname() {
        return tradingname;
    }

    public void setTradingname(String tradingname) {
        this.tradingname = tradingname;
    }

    public String getMainlocation() {
        return mainlocation;
    }

    public void setMainlocation(String mainlocation) {
        this.mainlocation = mainlocation;
    }

    public String getDeliverylocation() {
        return deliverylocation;
    }

    public void setDeliverylocation(String deliverylocation) {
        this.deliverylocation = deliverylocation;
    }

    public String getReturnlocation() {
        return returnlocation;
    }

    public void setReturnlocation(String returnlocation) {
        this.returnlocation = returnlocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
