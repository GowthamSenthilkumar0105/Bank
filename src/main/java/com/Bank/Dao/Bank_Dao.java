package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Entity.Bank;
import com.Bank.Repository.Bank_Repository;

@Repository
public class Bank_Dao {
	@Autowired
	Bank_Repository bankrepo;
	
	public String addBank(List<Bank> b) {
		bankrepo.saveAll(b);
		return "Saved Successfully";
	}
	
	public List<Bank> getBank() {
		return bankrepo.findAll();
	}
	
	public String getBranch(String ifsc) {
		return bankrepo.getBranch(ifsc);
		
	}

}
