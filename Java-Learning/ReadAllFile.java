import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllFile {

    public static void main(String[] args) {
        var nameFile = "newFile.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            System.out.println("File Content: ");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
