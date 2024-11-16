package com.Bank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_details")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String ifsc_Code;
	private String bank_Name;
	private String branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIfsc_Code() {
		return ifsc_Code;
	}
	public void setIfsc_Code(String ifsc_Code) {
		this.ifsc_Code = ifsc_Code;
	}
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
