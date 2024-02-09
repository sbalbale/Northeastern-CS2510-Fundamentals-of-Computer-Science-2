# uk.ac.nulondon:lab02

Goals: The goals of this lab are to get familiar with our testing environment, how to write tests, and understanding test output.

The second part of the lab will focus on some nested for-loop exercises that will be helpful practice for Homework 1.

JUnit Testing
A big concept of JUnit is AssertionsLinks to an external site.. Assertions help us assert if something is equal, true, false. etc.

Create a new project
Open your Command Prompt (Windows)/Terminal (Mac). Navigate to the folder you're organizing all your Fundies 2 projects in using the following command:

cd [path to your folder]
cd stands for "Change Directory". This command will navigate your terminal over to the specified path. Any commands you run that create files will organize the files into the specified directory.

Paste and run the following command in your command line (Command Prompt for Windows, Terminal for Mac):

mvn archetype:generate -DarchetypeArtifactId=homework-quickstart -DarchetypeGroupId=org.atp-fivt -DarchetypeVersion=1.09 -Djavaversion=21
When prompted, enter the following:

groupId: uk.ac.nulondon
artifactId (aka the name of this project): lab2
version: press Enter (default value '1.0-SNAPSHOT' is ok)
package: press Enter (default value 'uk.ac.london' is ok)
Create a new class
Instead of using the App/AppTest classes that come with your project, we're going to be creating our own!

In IntelliJ, click on the uk.ac.nulondon package.

image.png

Navigate to File > New > Java Class.

image.png

Name the class StringFuncs, and hit Enter.

image.png

Congratulations! You've made your first new class. Our new class will appear in the uk.ac.nulondon folder.

image.png

StringFuncs.java
Let's add some methods to our StringFuncs class. Copy and paste the following into your StringFuncs class:

public boolean startsWithY(String test) {
char firstCharacter = test.charAt(0);
if(firstCharacter == 'y' || firstCharacter == 'Y') {
return true;
}
else {
return false;
}
}

// A cleaner implementation of startsWithY
// Beware!! An empty string will break this.
public boolean startsWithY2(String test) {
return(test.charAt(0) == 'y' || test.charAt(0) == 'Y');
}

// Returns the first character concatenated with the string length
// Ex: "ben" would become "B3"
public String bingoWord1(String toConvert) {
// Capitalize the word and then grab the first character
char firstCharacter = toConvert.toUpperCase().charAt(0);

    // Get the word length
    int len = toConvert.length();

    // Returns the initial and concatenates it with the string length
    return "%s%d".formatted(firstCharacter, len);
}

// A faster version of bingoWord
public String bingoWord2(String toConvert) {
return(Character.toUpperCase(toConvert.charAt(0)) +
Integer.toString(toConvert.length()));
}

public static void main(String[] args) {
}
We've written the startsWithY and bingoWord functions for you.

Writing tests
Create a new class in your test folder called StringFuncsTest. Your test folder should look like this:

image.png

Let's write our first test! JUnit 5 has an Assertions class for all the common assertions we might want to make. We can use partial completion to find the assertion that we want, for example assertThat.

autofill.png

Some key points:

@Test - lets IntelliJ know that the following method is a test. Without it, IntelliJ will warn you that there are "no usages" of the function elsewhere in your code. It also enables you to be able to run individual tests without running the entire test suite.
void - test methods always return void. We don't expect a return value from our test functions; if they fail, JUnit will let us know.
Assertions - this is how we will mark that we're making a comparison. You can read more about assertions hereLinks to an external site..
Here's our first test:

Screenshot 2024-01-23 at 2.13.16 PM.png

This test checks that calling startsWithY on "Yes" will return true. We need to create a new StringFuncs object to call our startsWithY() method because startsWithY() is not static. Alternatively, you may include the new object at the top of your StringFuncsTest class since we'll be testing multiple functions from this class:

public class StringFuncsTest {

    StringFuncs myStringFunc = new StringFuncs();


    [...your tests here...]

}
You can also include multiple assertions inside one @Test method like so:

Screenshot 2024-01-23 at 2.13.25 PM.png

Running Tests
Clicking on the play button next to individual tests or the play button in the upper right hand corner of IntelliJ will run tests. When the test runs, IntelliJ shows the result in the run tool window towards the bottom of the screen.

Screenshot 2024-01-23 at 9.13.59 AM.png

^ Here, we can see that one test passed (yay!)

Test Failure
The following test will fail:

Screenshot 2024-01-23 at 2.13.32 PM.png

When a test fails, we can view the Expected and Actual output in the run tool window towards. the bottom of the screen. failure.png

Export Maven Plugin
Professor Ivan has put together a Maven plugin to help make zipping and exporting your projects easier.

He's created a video tutorial you can follow hereLinks to an external site..

To use the plugin, insert the following into the <Plugins> section of your pom.xml file:

    <plugin>
        <groupId>org.atp-fivt</groupId>
        <artifactId>export-maven-plugin</artifactId>
        <version>1.0</version>
        <configuration>
            <zipFileName>Name_Surname.zip</zipFileName>
        </configuration>
    </plugin>
The zipFileName parameter allows you to specify the desired name for the zip file. By default, the file name is set to export.zip.

To run the plugin, execute:

mvn export:export
The resulting .zip file will be located in the target directory. Going forward, use this command to zip up your projects for submission.

IntegerGrid.java
Homework 1 asks you to implement some functions that work with a 2D array. We'll go over the skeleton of the assignment, function signatures, and some 2D array basics in today's lab.

Submission
If you'd like feedback on your tests, submit your lab2 project as a zipped file to GradescopeLinks to an external site..

Key lab objectives:

Practice writing @Test and @ParameterizedTest for startsWithY() and bingoWord()
Export Maven plugin tutorial
Start Homework 1

Java version 21

Generated at 2024-01-23 13:15:52
