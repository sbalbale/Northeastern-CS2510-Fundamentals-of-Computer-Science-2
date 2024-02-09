# uk.ac.nulondon:hw02

DUE Friday February 9th, 11:59pm

This is a formative assignment.

In this homework we will be working with ArrayLists in Java. We will also be working with files. To help you with testing and running your code, we also have two files:
Report2014.csvDownload Report2014.csv
Report2014small.csvDownload Report2014small.csv

Download the above files to the src/main/resources folder of your project. (Please try this early, so that we can help you with your computer if needed.)

The data sets were are working with records number of events and the day that they occurred. The first column is the month of the event, the second is the day, the third is the hour, and the fourth is the count of event occurrences that day and hour.

For example: 5,4,12,10 would refer to the fact that on May 4th at noon there were 10 occurrences of the event. The larger file has over 290,000 records, so days and times appear more than once, these all refer to unique events and occurrences. (Locations and other descriptors were removed from this file when downloaded from Kaggle.)
The goal is to answer three questions on this data set:
What is the total number of events that happened over this time period (The year 2014)?
Which month had the most number of events?
Is an event more likely to happen at night or during the day?
You will turn in your entire project as a zip file for this assignment. You will create two files: one that contains a class that has 4 public methods, and another test class that tests these methods.
Setup
In order to work with the CSV file, we will need to plug in an external library called Apache Commons CSV. You may do this by adding the following to the <dependencies> section of your pom.xml file.

<dependency>
 <groupId>org.apache.commons</groupId>
 <artifactId>commons-csv</artifactId>
 <version>1.10.0</version>
</dependency>
Class
Create a class named ArrayListFuncs. This class must have a member variable:

private final List<int[]> records;
Create an ArrayListFuncs constructor that takes in a List<int[]> and initializes records.

Add the following function to your ArrayListFuncs file:

public static List<int[]> readFile() {
try (FileReader in = new FileReader("src/main/resources/Report2014.csv");
CSVParser parser = CSVFormat.DEFAULT.parse(in)) {
return parser.stream().skip(1)
.map(CSVRecord::values)
.map(r -> Arrays.stream(r).mapToInt(Integer::parseInt).toArray())
.toList();
} catch (IOException e) {
throw new IllegalStateException(e);
}
}
Note: Don't worry if the code in this function looks confusing. What's important to understand is that this function returns List<int[]> records with data read from the CSV file.

After you've added the member variable, constructor, and readFile function, your file head should look something like this:

package uk.ac.nulondon;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
Methods
ArrayListFuncs has four public methods defined below:

Total Number of Events: The class has a static public method named sunEvents() that takes uses records and returns the total number of events.
Month with the most occurrences: The class has a public method named maxMonth() that uses records. It returns the month with the most occurrences.
Nighttime vs Daytime. The class has a public static method named nightHasMore() which returns a boolean. Day is defined as hours between 6 and 19. Night is 20-23 and 0-5 inclusive. This function determines whether there are more nighttime events vs. daytime events.
main: The class should have a main() function which calls the readFile() method to get a list of records. It then creates an instance of ArrayListFuncs passing records a parameter to its constructor and then answers the questions above using the function defined above. Use System.out.printf(...) to print the answers to the questions above. Your print statements should follow the following format:
Total number of events:
Month with the most occurrences:
Night has more events:
Test
You should have a second Java file ArrayListFuncsTest that uses JUnit to test the sunEvents(), maxMonth(), nightHasMore(), and any helper functions. You should include multiple test to these functions to see that they have been written properly.

Notes
Test your functions. We recommend creating a separate test method for each function. You should write 2-3 tests per function. Make sure to consider edge cases!
Note: This includes helper functions; you need to test every helper function you write.
You do not need to test constructors for this assignment.
Comment/document your code! Leave comments before and within your functions to explain their purpose.
Submission
You will submit your entire project as a zip file to GradeScopeLinks to an external site.LinksLinks to an external site. to an external site..
Note: This is a new Gradescope link. Let us know if you're having trouble accessing it.

See Creating and Exporting a Project on

Java version 21

Generated at 2024-01-31 22:49:42
