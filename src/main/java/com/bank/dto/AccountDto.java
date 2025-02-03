package com.bank.dto;

import lombok.Data;

@Data
public class AccountDto {

	private Long acc_num;
	private String account_holder_name;
	private String account_type;
	private double account_balance;
	
	
	
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AccountDto(Long acc_num, String account_holder_name, String account_type, double account_balance) {
		super();
		this.acc_num = acc_num;
		this.account_holder_name = account_holder_name;
		this.account_type = account_type;
		this.account_balance = account_balance;
	}
	
	
	public Long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(Long acc_num) {
		this.acc_num = acc_num;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
	
	

}
