package com.bank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.AccountDto;
import com.bank.entity.AccountDetails;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/api/bank")
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	
	
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		AccountDto accountDetails=service.createAccount(accountDto);
		return new ResponseEntity<>(accountDetails,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
		AccountDto accountDto = service.getAccountDetialsById(id);
		return ResponseEntity.ok(accountDto);
	}
	
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDto> depositMoney(@PathVariable Long id ,@RequestBody Map<String, Double> request){
		Double amount= request.get("amount");
		AccountDto dto = service.depositAmount(id,amount);
		return ResponseEntity.ok(dto);
	}
	
	
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDto> withdrawMoney(@PathVariable Long id , @RequestBody Map<String, Double> request){
		Double amount= request.get("amount");
		AccountDto dto = service.withdrawAmount(id,amount);
		return ResponseEntity.ok(dto);
	}
	
	
	@GetMapping("/allAccounts")
	public ResponseEntity<List<AccountDto>> getAllAccounts(){
		List<AccountDto> dtoAccountDetails = service.getAllAccountDetails();
		return ResponseEntity.ok(dtoAccountDetails);
	}

}
