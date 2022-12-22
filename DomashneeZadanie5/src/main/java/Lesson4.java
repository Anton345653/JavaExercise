import java.io.*;


public class Lesson4 {
    public static void main(String[] args) {

    String inputFile = "fileput.txt";
    String outputFile = "fileout.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                }
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }}}

