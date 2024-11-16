package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.Bank_Service;

@RestController
public class Bank_Controller {
	@Autowired
	Bank_Service bankser;
	@PostMapping("/addbank")
	public String addBank(@RequestBody List<Bank> b) {
		return bankser.addBank(b);
	}
	@GetMapping(value="/getbank")
	public List<Bank> getBank() {
		return bankser.getBank();
	}
	@GetMapping(value="/getbranch/{ifsc}")
	public String getBranch(@PathVariable String ifsc) {
		return bankser.getBranch(ifsc);
		
	}
	

}
