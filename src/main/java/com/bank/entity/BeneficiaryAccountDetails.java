package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "beneficiary_AccountDetails")
@Entity
public class BeneficiaryAccountDetails {
    @Id
    @GeneratedValue
    @Column(name = "beneficiary_account_number")
    private Long beneficiaryAcNo;

    @Column(name = "beneficiary_name")
    private String beneficiaryName;

    @Column(name = "beneficiary_address")
    private String beneficiaryAddress;

    @Column(name = "beneficiary_bank")
    private String beneficiaryBank;

    public BeneficiaryAccountDetails(Long beneficiaryAcNo, String beneficiaryName, String beneficiaryAddress, String beneficiaryBank) {
        this.beneficiaryAcNo = beneficiaryAcNo;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryAddress = beneficiaryAddress;
        this.beneficiaryBank = beneficiaryBank;
    }

    public Long getBeneficiaryAcNo() {
        return beneficiaryAcNo;
    }

    public void setBeneficiaryAcNo(Long beneficiaryAcNo) {
        this.beneficiaryAcNo = beneficiaryAcNo;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public String getBeneficiaryBank() {
        return beneficiaryBank;
    }

    public void setBeneficiaryBank(String beneficiaryBank) {
        this.beneficiaryBank = beneficiaryBank;
    }

    @Override
    public String toString() {
        return "BeneficiaryAccountDetails{" +
                "beneficiaryAcNo=" + beneficiaryAcNo +
                ", beneficiaryName='" + beneficiaryName + '\'' +
                ", beneficiaryAddress='" + beneficiaryAddress + '\'' +
                ", beneficiaryBank='" + beneficiaryBank + '\'' +
                '}';
    }
}
