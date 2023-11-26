package week_09.Question_09_07;

import java.util.Date;

public class Account {
    private final int id;
    private double balance;
    private final double annualInterestRate;
    private final Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate / 100;
        dateCreated = new Date();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(int withdrawAmount) {
        balance -= withdrawAmount;
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public int getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "      Account Statement :        " +
                "---------------------------------" +
                "Account ID       :" + this.id +
                "Date created     :" + this.dateCreated.toLocaleString() +
                "Balance          :$" + this.balance +
                "Monthly Interest :" + this.getMonthlyInterest();
    }
}
