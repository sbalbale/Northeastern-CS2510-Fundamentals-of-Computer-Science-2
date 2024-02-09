# uk.ac.nulondon:hw03

DUE Friday February 16th, 11:59pm

This is a formative assignment.

In this homework we will practice with our single linked list from class. Specifically, we will add a few methods to our linked list data structure and then use it to implement a linked list of linked lists to mimic our IntegerGrid from the first homework.

See Creating and Exporting a Project on how to create/zip your project.

NOTE: Any time we refer to a linked list, we'll be using our MySingleLinkList implementation. This is an exercise in writing existing methods by hand to learn how linked lists work. Do not use the built-in LinkedListLinks to an external site. implementation.

Deliverables: You will submit your entire project as a zip file to GradeScopeLinks to an external site.LinksLinks to an external site. to an external site.. You will work with three files: the modified class MySingleLinkList, a new IntegerGridLL, and a test file.

MySingleLinkList
Create a new project for Homework 3. Add the MySingleListLink.java Download MySingleListLink.javaand Node.java Download Node.javafiles to your src > main > java > uk.ac.nulondon folder (they should be on the same level as the given App class). You will add three new methods to the MySingleLinkList class.

public T getAt(int index): This method mimics the ability to index into a linked list. The first node in the linked list is 0, the second 1, just as in an array. If a node exists at index the method returns the value stored at that location. If there is no node at that index the method returns null.
public boolean removeAt(int index): This method removes the node located at the given index if it exists. If there is no node at that index, the method throws an IndexOutOfBounds exception.
public String toString(): This method converts the values of the linked list into a String. You may assume that the type T toString works. The data values are all separated by a space. There is no trailing space after the last data element. The last value is a new line. As before, to get a universal newline you can use System.lineseparator().
IntegerGridLL
You will implement a linked list of linked lists of Integers. Namely you will have a linked list with a node type of MySingleLinkeList<Integer>. So every element in the outer linked list will contain a linked list of Integers and a next. The next refers to the next linked list of Integers.

The outer linked list represent rows, that is, each element in the linked list is linked list of integers representing a row in the grid.

Because of this data structure the number of columns will vary row by row.

There are important differences between this implementation and the one on Homework 1, please read carefully.

Class
Create a class named IntegerGridLL. It has two constructors, and 4 public methods. The public methods are toString, deleteRow, getRowSize, and getColumnSize. It has a private data member that is a linked list of linked lists of Integers named grid.

Constructors
The class has two public constructors. The first takes in nothing and just makes the linked list, nothing is stored in the list at this time. The second public constructor takes in a linked list of linked list of Integers and makes a deep copy.

Methods
String: The public method toString, overrides the default method and creates a string out the the grid. It takes in nothing and returns a String. The string contains each value in the grid. It is created row by row. Values in the column are separated by a space. There is no trailing space at the last value in a row, but instead a newline. As before, to get a universal newline you can use System.lineseparator(). This method returns the newline as a String. You are required to use the StringBuilder class. You can use the built in append method.
Delete Row: The public method deleteRow takes in an int, r, and returns nothing. The int given to the method refers to the row that is to be deleted. The row value is a direct correspondence to the index in grid. Namely, row 0 is the first row, rowCount-1 is the last.
Row Size: The public method getRowSize takes in nothing and returns an int. The int is the number of rows in grid.
Column Size: The public method getColumnSize takes in an int, r, and returns an int. The int is the number of columns in grid at row index r.
Testing
You should create unit tests as you have in lab and the previous homework. You should create tests for the toString, deleteRow, getRowSize, and getColumnSize methods in IntegerGridLL.

Notes
Test your functions. We recommend creating a separate test method for each function. Make sure to consider edge cases!
Note: Good test coverage includes helper functions; you need to test every helper function you write.
You do not need to test constructors for this assignment.
Comment/document your code! We expect JavadocLinks to an external site. comments for this assignment. These comments should follow Javadoc conventions/formatting and include a description of the method's functionality, parameters, and return values.
Submission
You will submit your entire project as a zip file to GradeScopeLinks to an external site.LinksLinks to an external site. to an external site..

See Creating and Exporting a Project on how to create/zip your project.

Java version 21

Generated at 2024-02-09 09:17:33
