package com.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;
import com.Customer.Repository.Customer_Repository;

@Repository
public class Customer_Dao {
	@Autowired
	Customer_Repository custrepo;
	
	public String addCust(List<Customer> c) {
		custrepo.saveAll(c);
		return "saved";
	}
	
	public List<Customer> getAll(){
		return custrepo.findAll();
	}
	
	public String addbranch(List<Customer> cb) {
		custrepo.saveAll(cb);
		return "Success";
	}

}
