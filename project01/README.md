# uk.ac.nulondon:project01

## You can find the photos from the outputs and inputs in the project images folder


Have you ever been unable to send an image because it was too large to export? In
this assignment you will be reducing the size of colour images stored in PNG format.
You will be implementing an adaptation of a compression technique called seam
carving.
You will write a program in Java that reduces the size of an image horizontally by
removing columns of pixels.
First the image will be read into the program using the method fromFileImage. You
can query the image to get the Color of a given pixel using the getColorAt(int x, int y)
method. Each pixel should be represented by a class Pixel containing all salient
information about each pixel in the image.
1
Assessment Brief: Coursework 2023-24
Given any image, your program will allow the user to indicate whether to remove the
bluest column, “b”, or a random column, “r”. The bluest column will use the metric of
the sum of the blue value of the RGB value stored as a pixel’s colour. The column to
be removed will be highlighted by the program. If removing the bluest, the chosen
column will be shown as blue on the image. If the column is selected at random, it
should be highlighted in red. The user will then confirm that the column should be
removed by typing “d”.
This program can be broken down into smaller tasks: (i) representing the image file
with a data structure of your choosing; (ii) finding the bluest column; (iii) removing a
column; and (iv) user interaction in the world program.
The program should allow the following key events:
“b” to remove the bluest column
“r” to remove a randomly selected column
“d” confirms the removal and shows the image without that column
“u” undo the most recent deletion
This program also requires you to construct new images, one pixel at a time.
Your design might consider the use of a ComputedPixelImage object. You might
consider methods such as setPixel(int x, int y, Color c) that allows you to set an
individual pixel, and setPixels(int x, int y, int width, int height, Color c) that allows you
to fill an entire rectangle’s worth of pixels with a single colour.
Finally, as you construct various examples of images, you may want to save them as
files. For this you can use the method saveImage(String filename), which will save
the current image as a PNG file. You may want to use this to make test cases for
yourself.

Java version 21

Generated at 2024-02-15 22:15:00
