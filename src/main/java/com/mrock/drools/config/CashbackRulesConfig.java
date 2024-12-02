package com.mrock.drools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:cashback-rules.properties")
public class CashbackRulesConfig {
    @Value("${moneytransfer.min.amount}")
    private Double moneyTransferMinAmount;
    
    @Value("${moneytransfer.cashback.amount}")
    private Double moneyTransferCashbackAmount;
    
    @Value("${topup.min.amount}")
    private Double topUpMinAmount;
    
    @Value("${topup.cashback.amount}")
    private Double topUpCashbackAmount;
    
    @Value("${billpayment.min.amount}")
    private Double billPaymentMinAmount;
    
    @Value("${billpayment.cashback.amount}")
    private Double billPaymentCashbackAmount;
    
    @Value("${multi.transaction.min.amount}")
    private Double multiTransactionMinAmount;
    
    @Value("${multi.transaction.cashback.amount}")
    private Double multiTransactionCashbackAmount;
    
    @Value("${multi.transaction.min.count}")
    private Integer multiTransactionMinCount;
    
    @Value("${multi.transaction.max.hours}")
    private Integer multiTransactionMaxHours;

    // Getters
    public Double getMoneyTransferMinAmount() {
        return moneyTransferMinAmount;
    }

    public Double getMoneyTransferCashbackAmount() {
        return moneyTransferCashbackAmount;
    }

    public Double getTopUpMinAmount() {
        return topUpMinAmount;
    }

    public Double getTopUpCashbackAmount() {
        return topUpCashbackAmount;
    }

    public Double getBillPaymentMinAmount() {
        return billPaymentMinAmount;
    }

    public Double getBillPaymentCashbackAmount() {
        return billPaymentCashbackAmount;
    }

    public Double getMultiTransactionMinAmount() {
        return multiTransactionMinAmount;
    }

    public Double getMultiTransactionCashbackAmount() {
        return multiTransactionCashbackAmount;
    }

    public Integer getMultiTransactionMinCount() {
        return multiTransactionMinCount;
    }

    public Integer getMultiTransactionMaxHours() {
        return multiTransactionMaxHours;
    }
} 