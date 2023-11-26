package week_11.Question_11_03;

import week_09.Question_09_07.Account;

public class CheckingAccount extends Account {

    private double limit;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double limit) {
        super(id, balance, annualInterestRate);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString(){
        return "\n      Checking Account Statement :        " +
                "\n ----------------------------------------" +
                "\n Account ID       :" + getId() +
                "\n Date created     :" + getDateCreated().toLocaleString() +
                "\n Balance          :$" + getBalance()+
                "\n Limit            :"+getLimit();
    }

}
