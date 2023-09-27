package act4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * <h1>Activitat 4</h1>
 * Mou un fitxer a un altre directori.
 */

public class MainClone {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("src/act4/Main.java");
        var destination = Paths.get("Main.java");

        Files.move(path, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
