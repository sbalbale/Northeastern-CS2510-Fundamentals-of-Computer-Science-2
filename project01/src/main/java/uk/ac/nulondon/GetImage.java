package uk.ac.nulondon;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GetImage {
    // Method to read an image from a file
    public BufferedImage read(String path) throws IOException {
        File input = new File(path);  // Create file object

        // Read image from file
        BufferedImage img = ImageIO.read(input);

        return img;   // Return the BufferedImage instance
    }
}