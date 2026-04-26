package com.springSecurity.EazyBank.springSecurity.sprinSection1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {


    @GetMapping("/cardDetails")
    public String getCardDetails(){
        return "Please find the Details of my account along with the card";
    }
}
