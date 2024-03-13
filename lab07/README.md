# uk.ac.nulondon:lab07

Goals: The goals of this lab are to practice writing JUnit tests. Sample tests and solution code to this lab will be posted after Friday's last lab.

Refer to the Creating and Exporting a Project Canvas page for setup/zipping help.

Setup
Create a new project called lab7. All the work in this lab will be done inside your test > java > uk.ac.nulondon package.

Download MySingleLinkTest

Overview
For this lab, you will practice writing tests against buggy code. You may assume there are three classes to represent the following:

A Student with an int studentID and String studentName
A Course as String courseName and String location
A Transcript as a Student student and a List<Course> grades
Your task is to write a series of JUnit tests to catch bugs in the code given a set of specifications. Create a new test file SchoolDirectoryTest and begin writing JUnit tests. Try writing the tests before looking at any of the code; it's okay if field names are slightly off.

Features
The code intended to support the following features:

A student name cannot be null
Student IDs are unique
There is only one transcript per student
addStudent
addStudent should add a student to the database
addStudent should return a unique ID for the new student
The database can have more than one student with the same name
A newly-added student should have an empty transcript
deleteStudent
deleteStudent should delete a student
deleteStudent should delete the student's transcript
Deleting a nonexistent student should throw an error
addCourse
addCourse should add a Course to the transcript of a student
Adding a second location in a course should throw an error
getLocation
Given a student and a course they have taken, getLocation should return that location
Getting a nonexistent course or location should return an empty string
Code
When you complete writing tests, import the following classes into your main directory:

SchoolDatabase.javaDownload SchoolDatabase.java
Student.javaDownload Student.java
Course.javaDownload Course.java
Transcript.javaDownload Transcript.java

Run your tests against the code and see how many bugs you catch. Then, fix SchoolDatabase.java. The amended code file and example test suite will be posted after Friday's last lab.

Java version 21

Generated at 2024-03-07 13:13:31
