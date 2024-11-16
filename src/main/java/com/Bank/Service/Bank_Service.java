package com.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Dao.Bank_Dao;
import com.Bank.Entity.Bank;

@Service
public class Bank_Service {
	@Autowired
	Bank_Dao bankdao;
	
	public String addBank(List<Bank> b) {
		return bankdao.addBank(b);
	}
	
	public List<Bank> getBank(){
		return bankdao.getBank();
	}
	
	public String getBranch(String ifsc) {
		return bankdao.getBranch(ifsc);
		
	}

}
