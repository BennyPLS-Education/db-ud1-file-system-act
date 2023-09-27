package act1;

import java.nio.file.Paths;


/**
 * <h1>Activitat 1</h1>
 * Construeix un path a partir d'un String
 * i mostra tota la informació possible d'aquest
 * path per consola.
 */

public class Main {
    public static void main(String[] args) {
        var path = Paths.get("src/act1/Main.java");

        System.out.println("Path Class Information");
        System.out.println("----------------------");
        System.out.println("Path : " + path);
        System.out.println("File Name : " + path.getFileName());
        System.out.println("Root : " + path.getRoot());
        System.out.println("Parent : " + path.getParent());
        System.out.println("Name Count : " + path.getNameCount());
        System.out.println("Name : " + path.getName(0));
        System.out.println("Subpath : " + path.subpath(0, 2));
        System.out.println("Is Absolute : " + path.isAbsolute());
        System.out.println("Absolute Path : " + path.toAbsolutePath());
        System.out.println("URI : " + path.toUri());
    }
}
