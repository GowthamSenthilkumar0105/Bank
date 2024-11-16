package com.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer.Entity.Customer;

public interface Customer_Repository extends JpaRepository<Customer, Integer>{

}
