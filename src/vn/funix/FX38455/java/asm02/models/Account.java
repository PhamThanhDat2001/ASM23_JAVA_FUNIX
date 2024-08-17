package vn.funix.FX38455.java.asm02.models;

import vn.funix.FX38455.java.asm03.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;

    //
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    //
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public boolean isPremiumAccount() {
        return this.balance >= 10_000_000;
    }

    @Override
    public String toString() {
        return accountNumber + "|                      " + balance + 'đ';
    }
}
////////////////