package com.yashodha.eirlssales.repository;

import com.yashodha.eirlssales.model.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepo extends JpaRepository<Enquiry, Integer> {
}
