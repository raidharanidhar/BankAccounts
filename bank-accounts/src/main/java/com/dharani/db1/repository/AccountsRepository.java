package com.dharani.db1.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dharani.db1.entity.AccountsEntity;

public interface AccountsRepository extends JpaRepository<AccountsEntity, Integer> {

	List<AccountsEntity> findByAccountNumber(String accountNumber);

	List<AccountsEntity>findByBankName(String bankName);
	
	List<AccountsEntity>findByBranchName(String branchName);
	
	List<AccountsEntity>findByIfscCode(String ifscCode);




	

}
