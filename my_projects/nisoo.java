package my_projects;

public class nisoo {
    public static void main(String[] args) {
        printrandomSmallChars();
    }

    public static void printrandomSmallChars() {
        for (int i = 1; i <= 120; i++) {
            // System.out.print("  " + (char) ((int) 'a' + (Math.random() * ('z' - 'a'))));
            System.out.print("  " + (char) ((int) 'a' + i - 1));
            // System.out.printf("%c ",(i-1+'a'));
            if (i % 30 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n\n\n");
        for (int i = 0; i < 26; i++) {
            System.out.print(i + 1 + " ");
        }
    }
}
