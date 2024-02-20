package uk.ac.nulondon;

import javax.swing.*;
import uk.ac.nulondon.SeamCarvingGui;
import uk.ac.nulondon.GetImage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SeamCarvingGui seamCarvingGui = null;

                try {
                    seamCarvingGui = new SeamCarvingGui();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


                seamCarvingGui.filePath = "src/main/resources/dog.png"; // Set the path to the image file.
                seamCarvingGui.setSize(600, 600); // Set your desired size of the GUI window.
                seamCarvingGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program when user closes the window.
                seamCarvingGui.setVisible(true);
            }
        });
    }

}
