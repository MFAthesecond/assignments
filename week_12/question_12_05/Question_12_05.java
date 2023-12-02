package week_12.question_12_05;

public class Question_12_05 {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle("blue", true, 3, 4, 5);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException ex) {
            System.out.println("We got a problem!!");
        }
    }
}
