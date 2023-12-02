package week_12.question_12_09;

public class BinaryFormatException extends Exception {
    public BinaryFormatException() {
        super("It is not a binary string!!");
    }

    public BinaryFormatException(String message) {
        super(message);
    }
}
