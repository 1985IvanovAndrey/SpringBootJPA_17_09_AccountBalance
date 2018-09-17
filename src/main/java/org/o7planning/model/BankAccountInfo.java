package org.o7planning.model;

import lombok.Data;

@Data
public class BankAccountInfo {

    private Long id;
    private String fullName;
    private double balance;

    public BankAccountInfo() {

    }

    // Used in JPA query.
    public BankAccountInfo(Long id, String fullName, double balance) {
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }

}
