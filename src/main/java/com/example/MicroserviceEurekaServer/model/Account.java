package com.example.MicroserviceEurekaServer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private int accountNumber;

    private String holderName;

    private String accountType;

    private double balance;
}
