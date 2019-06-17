package com.yashodha.eirlssales.repository;

import com.yashodha.eirlssales.model.EnquiryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryProductRepo extends JpaRepository<EnquiryProduct, Integer> {


}
