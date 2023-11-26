package week_11.Question_11_03;

import week_09.Question_09_07.Account;

public class SavingAccount extends Account {
    public SavingAccount() {
    }

    public SavingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }
    @Override
    public String toString(){
        return "\n     Saving Account Statement :        " +
                "\n --------------------------------------" +
                "\n Account ID       :" + getId() +
                "\n Date created     :" + getDateCreated().toLocaleString() +
                "\n Balance          :$" + getBalance();
    }
}
