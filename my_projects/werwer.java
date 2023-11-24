package my_projects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class werwer {


        public static void main(String[] args) {
            String inputFilePath = "C:\\Users\\mfaco\\Downloads\\Things.srt";
            String outputFilePath = "extracted_text.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

                StringBuilder currentLine = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty() && !isNumeric(line.trim()) && !line.contains("-->") && !line.matches("\\d+")) {
                        // Metin satırı
                        currentLine.append(line.trim()).append(" ");
                    } else if (line.matches("\\d{2}:\\d{2}:\\d{2},\\d{3}.*")) {
                        // Zaman damgası satırı
                        if (!currentLine.toString().isEmpty()) {
                            writer.write(currentLine.toString().trim());
                            writer.newLine();
                            currentLine = new StringBuilder();
                        }
                        currentLine.append(line).append(" ");
                    }
                }

                if (!currentLine.toString().isEmpty()) {
                    writer.write(currentLine.toString().trim());
                }

                System.out.println("Çıktı dosyası oluşturuldu: " + outputFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static boolean isNumeric(String str) {
            return str.matches("-?\\d+(\\.\\d+)?");
        }
    }

