package com.dharani.db1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dharani.db1.entity.AccountsEntity;
import com.dharani.db1.repository.AccountsRepository;

@Service
public class AccountServices {
	@Autowired
	AccountsRepository accountsRepository;
//	  RestTemplate restTemplate=new RestTemplate();
	  
//	  HttpEntity hhEntity=new HttpEntity<>(null);
	  
	public List<AccountsEntity> getAllAccounts1() {
		//List<AccountsEntity> accountEntityList = 
				return (List<AccountsEntity>) accountsRepository.findAll();
//				  ParameterizedTypeReference<List<com.bankacconts.bankaccounts.entity.EmployeeEntity>> typeRef = new ParameterizedTypeReference<List<com.bankacconts.bankaccounts.entity.EmployeeEntity>>() {};
//
//				 ResponseEntity<List<com.bankacconts.bankaccounts.entity.EmployeeEntity>>  responseEntity = restTemplate.exchange(
//			             "http://localhost:3000/api/allEmp",
//			             HttpMethod.GET,
//			             null,
//			             typeRef);
	}

	public void Update(AccountsEntity accountsEntity) {
		accountsRepository.save(accountsEntity);
	}

	public void delete(int id) {
		accountsRepository.deleteById(id);
	}

	public AccountsEntity getAccountById(int id) {
		return accountsRepository.findById(id).get();
	}

	public List<AccountsEntity> getBankByAccountNumber(String accountNumber) {
		List<AccountsEntity> accounts = accountsRepository.findByAccountNumber(accountNumber);
		return accounts;
	}

	public List<AccountsEntity> getBankName(String bankName) {
		List<AccountsEntity> accounts = accountsRepository.findByBankName(bankName);
		return accounts;
	}
	
	public List<AccountsEntity> getBranchName(String branchName) {
		List<AccountsEntity> accounts = accountsRepository.findByBranchName(branchName);
		return accounts;
	}
	
	public List<AccountsEntity> getBankByIfscCode(String ifscCode) {
		return  accountsRepository.findByIfscCode(ifscCode);
	
	}
	public List<AccountsEntity> getAllAccounts() {
		return accountsRepository.findAll();
	}
	

	

}
