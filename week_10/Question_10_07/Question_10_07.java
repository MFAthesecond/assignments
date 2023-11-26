package week_10.Question_10_07;

import week_09.Question_09_07.Account;

import java.util.Scanner;


public class Question_10_07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100, 1);
        }
        boolean flag = true;
        while (flag) {
            System.out.print("Enter an id:");
            flag = MainMenu(accounts[input.nextInt()]);
        }

    }

    private static boolean MainMenu(Account account) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Main menu ");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");

            int user = input.nextInt();
            switch (user) {
                case 1:
                    System.out.println("The balance is " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw:");
                    account.withdraw(input.nextInt());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit:");
                    account.deposit(input.nextInt());
                case 4:
                    return false;
            }
        }
    }
}
