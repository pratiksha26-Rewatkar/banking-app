package com.springSecurity.EazyBank.springSecurity.sprinSection1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/loanDetails")
    public String getLoansDetails(){
        return "Please find the Details of my Loan account";
    }
}
