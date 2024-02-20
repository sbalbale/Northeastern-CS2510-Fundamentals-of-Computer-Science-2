package uk.ac.nulondon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import uk.ac.nulondon.GetImage;

public class SeamCarvingGui extends JFrame {
    private GetImage getImage = new GetImage();  // Create an object of GetImage for reading image files.
    private JButton blueSeamBtn = new JButton("Remove Blue Seam");
    private JButton randomSeamBtn = new JButton("Remove Random Seam");
    private JButton undoBtn = new JButton("Undo");

    public String filePath = "src/main/resources/dog.png";

    // Assume you have a method getImage() that returns an Image object.
    // This should return the processed image after each action.


    public SeamCarvingGui() throws IOException {
        super("Seam Carving");

        setLayout(new FlowLayout());

        add(blueSeamBtn);
        add(randomSeamBtn);
        add(undoBtn);
        // Assume the initial image is "input.png" in your project folder.

        ImageIcon icon = new ImageIcon(filePath);  // Reads an image from a file and creates an Icon instance.

        JLabel imageLabel = new JLabel(icon); // Creates a label with the given Icon.

        add(imageLabel); // Add image label to GUI.

        blueSeamBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeBlueSeam();

                // Update the icon of ImageLabel after each removal.
                    imageLabel.setIcon(new ImageIcon(filePath));
            }
        });

        randomSeamBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeRandomSeam();

                // Update the icon of ImageLabel after each removal.
                imageLabel.setIcon(new ImageIcon(filePath));
            }
        });

        undoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undoLastRemoval();

                // Update the icon of ImageLabel after each removal.

                    imageLabel.setIcon(new ImageIcon(filePath));
            }
        });
    }

    private void removeBlueSeam() {
        // find the bluest column and highlight it red

    }

    private void removeRandomSeam() {
        // Your logic to remove random seam goes here...
    }

    private void undoLastRemoval() {
        // Your logic to undo last removal goes here...
    }
}