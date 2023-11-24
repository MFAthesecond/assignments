package my_projects;

public class qwe {
    public static void main(String[] args) throws InterruptedException {
        String runningMan = "  O\n" +
                " /|\\\n" +
                " / \\";

        String[] frames = {
                "_",
                "-",
                "*",
                "/"
        };

        int distance = 10;

        while (true) {
            for (int i = 0; i <= distance; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" "); // Boşlukları ekle
                }
                System.out.println(frames[i % frames.length] + runningMan); // Koşan adamı yazdır
                Thread.sleep(200); // 200 milisaniye bekle
                clearConsole(); // Konsolu temizle
            }

            for (int i = distance - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" "); // Boşlukları ekle
                }
                System.out.println(frames[i % frames.length] + runningMan); // Koşan adamı yazdır
                Thread.sleep(200); // 200 milisaniye bekle
                clearConsole(); // Konsolu temizle
            }
        }
    }

    // Konsolu temizlemek için kullanılan metot
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Konsolu temizlerken bir hata oluştu: " + e.getMessage());
        }
    }
}
