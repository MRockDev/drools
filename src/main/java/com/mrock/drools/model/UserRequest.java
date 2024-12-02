package com.mrock.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String msisdn;
    private TransactionType transactionType;
    private int transactionTime;
    private int diffTranCount;
	private double amount;

}
