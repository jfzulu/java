
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        // Read file
        var nameFile = "newFile.txt";
        var file = new File(nameFile);

        try {
            System.out.println("File Content: ");
            // Open file for reading
            var entrada = new BufferedReader(new FileReader(file));
            // Read file line by line
            var line = entrada.readLine();
            // Read all lines
            while (line != null) {
                System.out.println(line);
                line = entrada.readLine();
            }

            entrada.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
