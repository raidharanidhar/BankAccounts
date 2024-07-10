package com.Statements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.db1.entity.AccountsEntity;

@RestController
public class Controller {
	
	@Autowired
	Services services;
	
	@PostMapping("/getaccounts")
    private List<Entity> getAllAccounts()
    {
	return services.getAllAccounts();
    }
}
