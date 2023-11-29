package com.code.design.patterns;

public class ImmutableDP {
    private final int accountNumber;
    private final String accountName;

    public ImmutableDP(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountName() {
        return this.accountName;
    }
}

