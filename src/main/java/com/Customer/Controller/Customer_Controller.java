package com.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.Entity.Customer;
import com.Customer.Service.Customer_Service;

@RestController
@RequestMapping("/customer")
public class Customer_Controller {
	@Autowired
	Customer_Service custser;

	@PostMapping(value = "/addcust")
	public String addCust(@RequestBody List<Customer> c) {
		return custser.addCust(c);
	}
	@GetMapping(value="/getcust")
	public List<Customer> getAll(){
		return custser.getAll();
	}

	@PostMapping(value = "/addbranch")
	public String addbranch() {
		return custser.addbranch();
	}

}
