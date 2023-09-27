package act4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * <h1>Activitat 4</h1>
 * Mou un fitxer a un altre directori.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("src/act4/MainClone.java");
        var destination = Paths.get("MainAct4.java");

        Files.move(path, destination, StandardCopyOption.REPLACE_EXISTING);
        // Para poder testear con mas facilidad.
        Files.copy(destination, path, StandardCopyOption.REPLACE_EXISTING);
    }
}
