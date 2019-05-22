package com.yashodha.eirlssales.repository;

import com.yashodha.eirlssales.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository <Customer, Integer> {

}
