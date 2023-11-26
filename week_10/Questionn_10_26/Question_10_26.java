package week_10.Questionn_10_26;

import java.util.Scanner;

public class Question_10_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ");
        String s = input.nextLine();
        char[] temp = new char[3];

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (!Character.isDigit(temp[0])) {
                    temp[0] = s.charAt(i);
                } else temp[2] = s.charAt(i);
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                temp[1] = s.charAt(i);
            }
        }
        int num1 = temp[0] - '0';
        int num2 = temp[2] -'0';
        int result = 0;
        switch (temp[1]) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.printf("%d %c %d = %d",num1,temp[1],num2,result);
    }
}
