# uk.ac.nulondon:hw01

This is a formative assignment.

In this homework we will be working with a Java class which has a 2D array of ints. This is to give you practice creating and modifying 2D arrays. Note: This is practice. We will see next week that an ArrayList may be a better implementation than the standard two dimensional  array. You will be practicing nested loops, printing, and building a constructor for the class. For now we will not use exceptions to handle an index out of bounds, but will add this feature soon.

Reminder: This homework is straightforward and generative AI tools can solve this homework. As mentioned, you should not use any of these tools, it is a violation of the academic integrity policy. Further, it will set you up for success in class and on future assignments if you did this completely on your own.

Deliverables: You will submit an zip file of your entire project. Details are outlined below.

Class: Create a class named IntegerGrid. It has two constructors, and 5 public methods. The public methods are
```
populate, tostring, deleteRow, getRowSize, getColumnSize
```
It has a private data member that is a 2D array of ints named grid.
Constructors: The class has two public constructors.
The first takes in an int referring to the number of rows, row, and an int referring to the columns, col. It then makes the new 2D array from the private data member grid with row rows and col columns.
The second public constructor takes in a 2D array of ints and makes a deep copy of that array, storing it in grid.
Note: by deep copy we mean that a completely new 2D array is created and grid  refers to that new 2D array. The values in each of the 2D arrays are identical.
Populate: The public method populate takes in an int, s, and returns nothing. It does add values to the 2D array grid. The value of grid[i][j] is i+j+s after populate is called.
String: The public method toString, overrides the default method and creates a string out the the grid. It takes in nothing and returns a String. The string contains each value in the grid. It is created row by row. Values in the column are separated by a space. There is no trailing space at the last value in a row, but instead a newline.
Suppose we had a 2D array

```
int[][] gridExample = {{2, 1, 6},  {3, 4, 4}, {5, 7, 9}};
// this would result in String s = “2 1 6\n3 4  4\n5 7 9\n”
```
Where \n is the systems version of newline. Our systems are different and newlines are not the same on a Mac as with a PC. To get a universal newline you can use System.lineseparator(). This method returns the newline as a String. To create this string you should use the StringBuilder class. You can use the built in append method. This method takes in primitive types  and appends them to the StringBuilder object. It also has a toString() method which converts the StringBuilder to a String
Delete Row: The public method deleteRow takes in an int, r, and returns nothing.  The int given to the method refers to the row that is to be deleted. The row value is  a direct correspondence to the index in grid. Namely, row 0 is the first row, rowCount-1 is the last. The function resizes grid to be a new 2d array with  rowCount reduced by 1. The new 2D array is the same as before, but with row r  removed.
Row Size: The public method getRowSize takes in nothing and returns an int. The int is the number of rows in grid.
Column Size: The public method getColumnSize takes in nothing and returns an int. The int is the number of columns in grid.
Notes

You should test your functions using JUnit. We recommend creating a separate test method for each function and your constructors. You should write 2-3 tests per functionality in an IntegerGridTest.java file. Make sure to consider edge cases!
You will need to resize the array, this is equivalent to making a whole new one and copying data over.
You will need to practice nested loops for several of these methods.

Java version 21

Generated at 2024-01-24 10:37:23
