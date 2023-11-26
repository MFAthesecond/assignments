package week_11.Question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private final int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated;
    ArrayList<Transaction> transactions=new ArrayList<>();

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

    public Account(int id, String name, double balance, double annualInterestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
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

    public void withdraw(int withdrawAmount, String description) {
        balance -= withdrawAmount;
        transactions.add(new Transaction('W', withdrawAmount, balance, description));
    }

    public void deposit(int depositAmount, String description) {
        balance += depositAmount;
        transactions.add(new Transaction('D', depositAmount, balance, description));
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

    public void displayAccountSummary() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        for (Transaction t : transactions) {
            System.out.println(t.toString());
            System.out.println("----------------------------");
        }
    }
}
