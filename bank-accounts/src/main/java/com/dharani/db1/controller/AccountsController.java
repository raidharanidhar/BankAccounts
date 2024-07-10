package com.dharani.db1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dharani.db1.entity.AccountsEntity;
import com.dharani.db1.services.AccountServices;

@RestController
@RequestMapping("/student")
public class AccountsController {

	  @Autowired
	  AccountServices accountServices;
//	  RestTemplate restTemplate=new RestTemplate();
	  
	    @GetMapping("/getaccounts")
	    private List<AccountsEntity> getAllAccounts()
	    {
		return accountServices.getAllAccounts();
	    }

	    @PutMapping("/saving")
	    private void saveAccount(@RequestBody AccountsEntity accountsEntity){

	    	accountServices.Update(accountsEntity);
	    }

	    @DeleteMapping("/delete/{id}")
	    private void deleteAccount(@PathVariable("id")int id){
	    	accountServices.delete(id);

	    }
	    @GetMapping("/getaccountid/{id}")
	    private AccountsEntity getAccount(@PathVariable("id")int id){
	    return accountServices.getAccountById(id);
	    }
	    @PostMapping("/getaccountnumber/{accountNumber}")
	    private List<AccountsEntity> getAccount1(@PathVariable("accountNumber")String accountNumber){
	    return accountServices.getBankByAccountNumber(accountNumber);
	    }
	    
	    @PostMapping("/getbankname/{bankName}")
	    private List<AccountsEntity> getAccount(@PathVariable("bankName")String bankName){
	    return accountServices.getBankName(bankName);
	    }
	    
	    @PostMapping("/getbranchname/{branchName}")
	    private List<AccountsEntity> getAccount2(@PathVariable("branchName")String branchName){
	    return accountServices.getBranchName(branchName);
	    }
	    @PostMapping("/getifsccode/{ifscCode}")
	    private List<AccountsEntity> getAccount3(@PathVariable("ifscCode")String ifscCode){
	    return accountServices.getBankByIfscCode(ifscCode);
	    }
	    
	    
	    
	    @PostMapping(value ="/getemployee" ,produces = "application/json")
		public EmployeeResponse getemployee(@RequestBody EmployeeRequest employeeRequest) {
			EmployeeResponse kk = new EmployeeResponse();
			kk.setId(employeeRequest.getId());
			kk.setName(employeeRequest.getName());
			kk.setCity(employeeRequest.getCity());
			kk.setSalary(employeeRequest.getSalary());
			return kk;
	    }
	 
}
