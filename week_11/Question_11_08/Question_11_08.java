package week_11.Question_11_08;

public class Question_11_08 {
    public static void main(String[] args) {
        Account account=new Account(655465,1000,1.5);
        account.deposit(30,"su");
        account.deposit(20,"çikuleta");
        account.deposit(28,"lahmacun");
        account.deposit(70,"nam nam");
        account.withdraw(45,"keyf");
        account.withdraw(5,"asd");
        account.withdraw(15,"keaa");
        account.withdraw(47,"nam");
        account.displayAccountSummary();
    }
}
