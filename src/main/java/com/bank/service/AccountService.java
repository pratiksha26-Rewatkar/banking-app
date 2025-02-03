package com.bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.AccountDto;
import com.bank.entity.AccountDetails;
import com.bank.mapper.AccountMapper;
import com.bank.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	
	public AccountDto createAccount(AccountDto accountDto){
		AccountDetails details= AccountMapper.mapToAccount(accountDto);
		AccountDetails savedAccount=repository.save(details);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
	
	
	public AccountDto getAccountDetialsById(Long ID){
		AccountDetails accountDetails=repository
				.findById(ID)
				.orElseThrow(()-> new RuntimeException("Account does not exist"));
		
		return AccountMapper.mapToAccountDto(accountDetails);
		
	}
	
	
	public AccountDto depositAmount(Long ID , double amount){
		AccountDetails accountDetails=repository
				.findById(ID)
				.orElseThrow(()-> new RuntimeException("Account does not exist"));
		
		double totalAmount = accountDetails.getAccount_balance() + amount;
		accountDetails.setAccount_balance(totalAmount);
		AccountDetails updatedAccountDetails= repository.save(accountDetails);
		return AccountMapper.mapToAccountDto(updatedAccountDetails);
		
	}
	
	public AccountDto withdrawAmount(Long ID , double amount){
		AccountDetails accountDetails=repository
				.findById(ID)
				.orElseThrow(()-> new RuntimeException("Account does not exist"));
		
		if(accountDetails.getAccount_balance() < amount) {
			throw new RuntimeException("Insufficient Balance");
		}
		
		double totalAmount = accountDetails.getAccount_balance() - amount;
		accountDetails.setAccount_balance(totalAmount);
		AccountDetails updatedAccountDetails= repository.save(accountDetails);
		return AccountMapper.mapToAccountDto(updatedAccountDetails);
		
	}

	public List<AccountDto> getAllAccountDetails(){
		List<AccountDetails> accountSetails = repository.findAll();
		return accountSetails.stream().map((account) -> AccountMapper.mapToAccountDto(account))
				.collect(Collectors.toList());
	}
	
}
