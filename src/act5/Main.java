package act5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * <h1>Activitat 5</h1>
 * Copia un directori sencer.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("src/act5");
        var destination = Paths.get(" act5_copy");

        try (var paths = Files.walk(path, 1)) {
            paths.forEach(p -> {
                try {
                    Files.copy(p, destination.resolve(path.relativize(p)), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.out.println("Error copying file: " + e.getMessage());
                }
            });
        }
    }
}