package com.bank.mapper;

import com.bank.dto.AccountDto;
import com.bank.entity.AccountDetails;

public class AccountMapper {

	public static AccountDetails mapToAccount(AccountDto dto) {

		AccountDetails accountDetails = new AccountDetails(
				dto.getAcc_num(),
				dto.getAccount_holder_name(),
				dto.getAccount_type(),
				dto.getAccount_balance()

		);
		return accountDetails;

	}
	
	public static AccountDto mapToAccountDto(AccountDetails details) {

		AccountDto dto = new AccountDto(
				details.getAcc_num(),
				details.getAccount_holder_name(),
				details.getAccount_type(),
				details.getAccount_balance()

		);
		return dto;

	}

}
