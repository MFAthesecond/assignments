package week_04.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters:");
        String user = input.next();

        char major = user.charAt(0);
        char number = user.charAt(1);

        String field = "";
        String clas = "";

        switch (major) {
            case 'M':
                field = "Mathematics ";
                break;
            case 'C':
                field = "Computer Science ";
                break;
            case 'I':
                field = "Information Technology ";
                break;
        }
        switch (number) {
            case '1':
                clas = "Freshman";
                break;
            case '2':
                clas = "Sophomore";
                break;
            case '3':
                clas = "Junior";
                break;
            case '4':
                clas = "Senior";
                break;
        }
        if (field == "" || clas == "") {
            System.out.println("Invalid input");
        } else System.out.println(field + clas);
    }
}
