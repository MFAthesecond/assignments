package week_06;

    import static java.lang.Math.random;

public class Question_06_38 {
    public static char getRandomCharacter(char ch1, char ch2) {
        int diff= (int) ch2 - (int) ch1;
        return (char) ((int) ch1 +(int) (Math.random()*diff));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
