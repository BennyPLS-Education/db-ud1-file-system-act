package act2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * <h1>Activitat 2</h1>
 * Utilitza la classe Files
 * per mostrar per consola tota
 * la informació sobre un arxiu
 * del vostre sistema.
 */


public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("src/act2/Main.java");

        System.out.println("Files Class Information");
        System.out.println("----------------------");
        System.out.println("File : " + file);
        System.out.println("----------------------");
        System.out.println("Is Regular File : " + Files.isRegularFile(file.toPath()));
        System.out.println("Is Readable : " + Files.isReadable(file.toPath()));
        System.out.println("Is Writable : " + Files.isWritable(file.toPath()));
        System.out.println("Is Executable : " + Files.isExecutable(file.toPath()));
        System.out.println("Is Same File : " + Files.isSameFile(file.toPath(), file.toPath()));
        System.out.println("Is Hidden : " + Files.isHidden(file.toPath()));
    }
}
