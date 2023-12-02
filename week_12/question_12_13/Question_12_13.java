package week_12.question_12_13;

import java.io.File;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Question12_13 textFile");
            System.exit(1);
        }
      //  File twoCities = new File("C:\\Users\\mfaco\\workspace\\inar-java\\src\\week_12\\question_12_13\\temp.txt");
        Scanner input = new Scanner("C:\\Users\\mfaco\\workspace\\inar-java\\src\\week_12\\" + args[0]);

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String line = input.nextLine();

        int characters = countChars(line, characterCount);
        int words = countWords(line, wordCount);
        int lines = countLines(input, lineCount);

        System.out.println("File " + args[0] + " has ");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }

    private static int countChars(String line, int characterCount) {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                characterCount++;
            }
        }

        return characterCount;
    }

    private static int countWords(String line, int wordCount) {
        boolean flag = false;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                flag = true;
            }
            if (flag && line.charAt(i) == ' ') {
                wordCount++;
                flag = false;
            }
        }
        return wordCount;
    }

    private static int countLines(Scanner input, int lineCount) {
        while (input.hasNext()) {
            lineCount++;
        }
        return lineCount;
    }
}
