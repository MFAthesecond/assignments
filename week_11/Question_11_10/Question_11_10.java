package week_11.Question_11_10;

import java.util.Scanner;
import java.util.Stack;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.add(input.nextInt());
        }
        System.out.println(stack.toString());

        System.out.println("Displaying the in reverse order: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i)+" ");
        }
    }
}
