package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Account_Details")
@Entity
public class AccountDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Account_Number")
	private Long acc_num;
	
	@Column(name = "Account_Holder_Name")
	private String account_holder_name;
	
	@Column(name = "Account_Type")
	private String account_type;
	
	@Column(name = "Account_Balance")
	private double account_balance;
	
	
	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	

	public AccountDetails(Long acc_num, String account_holder_name, String account_type, double account_balance) {
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


	@Override
	public String toString() {
		return "AccountDetails [acc_num=" + acc_num + ", account_holder_name=" + account_holder_name + ", account_type="
				+ account_type + ", account_balance=" + account_balance + "]";
	}
	
	

}
