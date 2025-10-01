
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        var nameFile = "newFile.txt";
        var file = new File(nameFile);

        try {
            if (file.exists()) {
                System.out.println("File " + nameFile + " already exists");

            } else {
                // Creation of file
                var salida = new PrintWriter(file);
                salida.close();
                System.out.println("File " + nameFile + " created successfully");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}