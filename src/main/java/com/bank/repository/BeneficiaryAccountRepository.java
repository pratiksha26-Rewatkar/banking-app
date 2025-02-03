package com.bank.repository;

import com.bank.entity.BeneficiaryAccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryAccountRepository extends JpaRepository<BeneficiaryAccountDetails, Long> {
}
