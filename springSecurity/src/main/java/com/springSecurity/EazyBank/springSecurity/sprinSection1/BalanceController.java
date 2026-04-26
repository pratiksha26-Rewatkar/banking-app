package com.springSecurity.EazyBank.springSecurity.sprinSection1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {


    @GetMapping("/myBalanceDetails")
    public String getAccountDetails(){
        return "Please find the Details of my account Balance";
    }
}
