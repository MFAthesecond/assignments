package week_09.Question_09_07;

public class Question_09_07 {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.toString());
    }
}
