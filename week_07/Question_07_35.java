package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {

    public static void main(String[] args) {
        char[] lettersOfWord = {};
        char[] printing = {};
        initialize(lettersOfWord, printing);
    }

    private static void playGame(int length, char[] printing, char[] lettersOfWord, String word) {
        Scanner input = new Scanner(System.in);
        int control = 0, finito = 0, count = 0, right = 0;
        char guess = ' ';
        while (true) {
            displayPuzzle(length, printing);
            guess = input.next().charAt(0);
            count++;
            for (int i = 0; i < length; i++) {
                if (guess == lettersOfWord[i]) {
                    if (printing[i] == guess) {
                        System.out.println("\r       " + guess + " is already in the word");
                        break;
                    } else {
                        finito++;
                        if (control == 0) {
                            right++;
                        }
                        control++;

                        printing[i] = guess;
                    }
                } else if (control == 0 && i == length - 1) {
                    System.out.println("       " + guess + " is not in the word");
                    break;
                }
            }
            control = 0;
            if (finito == length) {
                int miss = (count - right > 0) ? count - right : 0;
                if (finish(miss, word)) {
                    break;
                } else {
                    initialize(lettersOfWord, printing);
                    break;
                }
            }
        }
    }

    private static void displayPuzzle(int length, char[] printing) {
        System.out.print("(Guess) Enter a letter in word ");
        for (int i = 0; i < length; i++) {
            System.out.print(printing[i]);
        }
        System.out.print(" >");
    }

    public static void initialize(char[] lettersOfWord, char[] printing) {
        String word = findWord();
        int length = word.length();
        printing = fillPrinting(length);
        lettersOfWord = fillLetter(word);
        playGame(length,
                printing,
                lettersOfWord,
                word);

    }

    private static boolean finish(int miss, String word) {
        Scanner input = new Scanner(System.in);
        System.out.printf("The word is %s. You missed %d time%s \n", word, miss, (miss > 1) ? "s" : "");
        System.out.print("Do you want to guess another word? Enter y or n >");
        return input.next().equals("n");
    }

    private static char[] fillPrinting(int length) {
        char[] printin = new char[length];
        Arrays.fill(printin, '*');
        return printin;
    }

    private static char[] fillLetter(String word) {
        char[] lettersOfWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            lettersOfWord[i] = word.charAt(i);
        }
        return lettersOfWord;
    }

    private static String findWord() {
        String[] words = {"write", "that", "arrays", "method", "hover", "actual"};
        return words[(int) (Math.random() * words.length)];
    }
}
