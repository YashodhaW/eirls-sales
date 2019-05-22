package com.yashodha.eirlssales.controller;


import com.yashodha.eirlssales.repository.EnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enquiries")
public class EnquiryController {

    @Autowired
    EnquiryRepo enquiryRepo;

    @GetMapping
    public List getAllEnquiry(){return enquiryRepo.findAll();}



}
