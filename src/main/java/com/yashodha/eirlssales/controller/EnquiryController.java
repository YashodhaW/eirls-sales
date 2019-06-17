package com.yashodha.eirlssales.controller;


import com.yashodha.eirlssales.model.Enquiry;
import com.yashodha.eirlssales.repository.EnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enquiries")
public class EnquiryController {

    @Autowired
    EnquiryRepo enquiryRepo;

    @GetMapping
    public List getAllEnquiry(){
        return enquiryRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Enquiry> getEnquiry(@PathVariable int id){
        return enquiryRepo.findById(id);
    }

    @PostMapping
    public Enquiry addEnquiry(@RequestBody Enquiry enquiry){
        return enquiryRepo.save(enquiry);
    }

    @PutMapping
    public Enquiry updateEnquiry(@RequestBody Enquiry enquiry){
        return enquiryRepo.save(enquiry);
    }



}
