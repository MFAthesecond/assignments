package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] Exams = takeResults();
        int[] scores = findScores(Exams);
        sortStudents(scores);
    }

    private static void sortStudents(int[] scores) {
        int[] students = new int[8];
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (sortedScores[i] == scores[j]) {
                    students[i] = j;
                    scores[j]=-1;
                    break;
                }
            }
        }
        printResults(sortedScores, students);
    }

    private static void printResults(int[] scores, int[] students) {
        for (int i = 0; i < 8; i++) {
            System.out.printf("Student %d's correct count is %d and score is %d\n", students[i], scores[i] / 5, scores[i]);
        }
    }

    private static int[] findScores(char[][] exams) {
        int[] scores = new int[8];
        for (int i = 0; i < 8; i++) {
            scores[i] = checkExamResult(exams[i]);
        }
        return scores;
    }

    private static char[][] takeResults() {
        Scanner input = new Scanner(System.in);
        char exams[][] = {{'E', 'C', 'C', 'C', 'A', 'E', 'E', 'B', 'E', 'A'},
                {'E', 'A', 'B', 'D', 'D', 'E', 'B', 'A', 'D', 'D'},
                {'E', 'E', 'D', 'D', 'A', 'B', 'D', 'C', 'A', 'E'},
                {'E', 'E', 'C', 'D', 'A', 'E', 'A', 'B', 'D', 'A'},
                {'D', 'B', 'A', 'B', 'A', 'C', 'E', 'B', 'D', 'D'},
                {'B', 'A', 'D', 'E', 'B', 'E', 'B', 'B', 'E', 'E'},
                {'A', 'B', 'E', 'A', 'D', 'C', 'B', 'C', 'C', 'A'},
                {'E', 'A', 'C', 'C', 'C', 'B', 'D', 'A', 'E', 'E'}};


        return exams;
    }

    private static int checkExamResult(char[] answers) {
        char[] key =  {'E', 'A', 'C', 'C', 'C', 'B', 'D', 'A', 'E', 'E'};
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == key[i]) {
                score += 5;
            }
        }
        return score;
    }
}
