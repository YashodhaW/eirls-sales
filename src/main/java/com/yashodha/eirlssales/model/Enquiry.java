package com.yashodha.eirlssales.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dmethod;
    private String ddate;
    private String status;
    private String orderstatus;

    @OneToMany(mappedBy = "enquiry", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("enquiry")
    private Set<EnquiryProduct> enquiryProducts;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<EnquiryProduct> getEnquiryProducts() {
        return enquiryProducts;
    }

    public void setEnquiryProducts(Set<EnquiryProduct> enquiryProducts) {
        this.enquiryProducts = enquiryProducts;
        this.enquiryProducts.forEach(enquiryProduct -> enquiryProduct.setEnquiry(this));
    }

}
