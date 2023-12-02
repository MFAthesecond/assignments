package week_12.question_12_08;

public class HexFormatException extends NumberFormatException{
    public HexFormatException() {
        super("It is not a hex string!!");
    }

    public HexFormatException(String s) {
        super(s);
    }
}
