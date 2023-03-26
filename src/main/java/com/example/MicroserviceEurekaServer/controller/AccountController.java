package com.example.MicroserviceEurekaServer.controller;

import com.example.MicroserviceEurekaServer.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("account")
    public Account getAccountInformation(){
        var account = new Account();
        account.setAccountNumber(101010);
        account.setHolderName("Krunal Sukhwani");
        account.setAccountType("Saving");
        account.setBalance(90000.34);
        return account;
    }
}
