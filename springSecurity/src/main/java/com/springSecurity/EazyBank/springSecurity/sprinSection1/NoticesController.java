package com.springSecurity.EazyBank.springSecurity.sprinSection1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/noticesDetails")
    public String getAccountDetails(){
        return "Please find the Details of my Notice Period";
    }
}
