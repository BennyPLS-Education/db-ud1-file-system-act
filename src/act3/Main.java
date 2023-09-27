package act3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * <h1>Activitat 3</h1>
 * Copia un fitxer entre dos directoris
 */

public class Main {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("src/act3/MainClone.java");
        var destination = Paths.get("Main.java");

        Files.copy(path, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully!");
    }
}
