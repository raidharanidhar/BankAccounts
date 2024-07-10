package com.Statements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dharani.db1.entity.AccountsEntity;

public class Services {

	@Autowired
	Repository repository;
	
	public List<Entity> getAllAccounts() {
		List<Entity> entityList = (List<Entity>) repository.findAll();
		return entityList;
}
}