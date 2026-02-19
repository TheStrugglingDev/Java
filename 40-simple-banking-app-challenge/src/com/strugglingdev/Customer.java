package com.strugglingdev;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(transactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }
}

