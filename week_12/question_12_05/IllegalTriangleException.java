package week_12.question_12_05;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("That parameters is not suitable for a triangle!!!");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
