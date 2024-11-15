import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        String path = "./src/input.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path));
             FileWriter writer = new FileWriter("./src/output");) {

            String line = br.readLine();
            String[] keyWords = line.split(" -> ");

            while ((line = br.readLine()) != null) {

                line=line.replaceAll(keyWords[0], keyWords[1]);

                writer.write(line);
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
