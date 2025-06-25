Student Record Management System (Console-Based Java App)

A simple Java console application to manage student records using basic CRUD operations.

Features:
Add Student – Add a student with ID, name, and marks (no duplicate IDs)
View Students – Display all student records
Update Student – Modify name and marks using student ID
Delete Student – Remove a student record by ID
Exit – Exit the application

Technologies Used
Java (JDK 11 or higher)
ArrayList for storing student data
Scanner for user input

How to Run
Compile the code:
javac Elevate_Tasks/Task2.java
Run the program:
java Elevate_Tasks.Task2
Follow the menu displayed in the console

Example Usage

=====Student Record Management System=====

Enter the choice to perform:

ADD STUDENT
VIEW STUDENT
UPDATE STUDENT
DELETE STUDENT
EXIT
 
Choice: 1
Enter the Student ID: 101
Enter the Student Name: Swapnil
Enter the Student Marks: 92
Student is successfully added..!

Choice: 2
---Student List---
Students: Student [stud_Id=101, stud_Name=Swapnil, stud_Marks=92]

Choice: 3
Enter the id you want to update: 101
Enter the new Name: Sahil
Enter the new Marks: 95
Student is successfully updated..!

Choice: 4
Enter the id you want to delete: 101
Student successfully deleted

Choice: 5
User Exited..!