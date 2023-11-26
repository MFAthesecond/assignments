package week_11.Question_11_03;

public class Question_11_03 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(4,1500,3);
        CheckingAccount checkingAccount = new CheckingAccount(8,2000,2,3500);
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());

    }
}
