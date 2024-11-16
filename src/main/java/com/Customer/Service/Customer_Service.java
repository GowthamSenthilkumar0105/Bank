package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.Customer.Dao.Customer_Dao;
import com.Customer.Entity.Customer;

@Service
public class Customer_Service {
	@Autowired
	Customer_Dao custdao;
	
	@Autowired
	RestTemplate rest;
	
	public String addCust(List<Customer> c) {
		return custdao.addCust(c);
	}
	
	public List<Customer> getAll(){
		return custdao.getAll();
	}
	
	public String addbranch() {
		
		String url="http://localhost:8080/getbranch/";
		List<Customer> cb=custdao.getAll();
		cb.forEach(x->{
			String ifsc=x.getIfsc_Code();
			
			ResponseEntity<String> br=rest.exchange(url+ifsc, HttpMethod.GET, null, String.class);
			
			String branch=br.getBody();
			
			x.setBranch(branch);
		});
		
		return custdao.addbranch(cb);
		
		
		
		
		
		
		
		
 		
		
	}

}
