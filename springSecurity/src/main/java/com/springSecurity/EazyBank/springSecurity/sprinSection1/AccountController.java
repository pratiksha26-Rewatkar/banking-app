package com.springSecurity.EazyBank.springSecurity.sprinSection1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccountDetails")
    public String getAccountDetails(){
        return "Please find the Details of my account";
    }
}
