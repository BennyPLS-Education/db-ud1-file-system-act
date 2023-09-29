package act6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * <h1>Activitat 6</h1>
 * Mostra per consola el contingut d'un directori,
 * inclosos els seus subdirectoris i els seus continguts.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("src");

        try (var paths = Files.walk(path)) {
            paths.forEach(p ->
                    System.out.println(p.getName(p.getNameCount() - 1))
            );
        }
    }
}