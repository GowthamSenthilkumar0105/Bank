package com.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.Entity.Bank;

public interface Bank_Repository extends JpaRepository<Bank, Integer>{
	
	@Query(value = "SELECT branch FROM bank_details where ifsc_Code like ?",nativeQuery = true)
	
	public String getBranch( String ifsc);

}
