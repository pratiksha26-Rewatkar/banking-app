package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.AccountDetails;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long>{

}
