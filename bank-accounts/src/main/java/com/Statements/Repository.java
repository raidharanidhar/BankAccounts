package com.Statements;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Entity, Integer>{
	
	List<Entity> findByAccountNumber(String accountNumber);

	List<Entity>findByaccountHoldersName(String accountHoldersName);
	


}
