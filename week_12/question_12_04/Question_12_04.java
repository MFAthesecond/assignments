package week_12.question_12_04;

public class Question_12_04 {
    public static void main(String[] args) {
        try{
        var loan = new Loan(3, 5, 0);
    }catch (IllegalArgumentException ex){
            System.out.println("We got a problem!!");
        }
    }
}
