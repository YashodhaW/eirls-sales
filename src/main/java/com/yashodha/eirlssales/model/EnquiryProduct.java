package com.yashodha.eirlssales.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class EnquiryProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qty;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("enquiryProducts")
    private Enquiry enquiry;

    @ManyToOne
    @JoinColumn
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Enquiry getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Enquiry enquiry) {
        this.enquiry = enquiry;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
