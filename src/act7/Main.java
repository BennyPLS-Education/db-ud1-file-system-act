package act7;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

/**
 * <h1>Activitat 7</h1>
 * Crea un Form amb un component Jtree que mostri la
 * mateixa informació que l'exercici anterior.
 * Prova-ho amb un directori "petitet".
 */

public class Main {
    private static void GUI() {
        File fileRoot = new File("src");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode(fileRoot);

        createNodes(root, fileRoot);

        JTree tree = new JTree(root);

        JScrollPane treeView = new JScrollPane(tree);

        JFrame frame = new JFrame("File Tree Demo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(treeView);
        frame.setSize(300, 500);
        frame.setVisible(true);
    }

    private static void createNodes(DefaultMutableTreeNode root, File fileRoot) {
        File[] files = fileRoot.listFiles();

        if (files == null) return;

        for (File file : files) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(file);
            root.add(node);

            if (file.isDirectory()) {
                createNodes(node, file);
            }
        }
    }

    public static void main(String[] args) {
        Main.GUI();
    }
}