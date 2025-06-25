//Task 2 :Student Record Management System
package Elevate_Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {

	private long stud_Id;
	private String stud_Name;
	private long stud_Marks;

	public long getStud_Id() {
		return stud_Id;
	}

	public void setStud_Id(long stud_Id) {
		this.stud_Id = stud_Id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public long getStud_Marks() {
		return stud_Marks;
	}

	public void setStud_Marks(long stud_Marks) {
		this.stud_Marks = stud_Marks;
	}

	public Student(long stud_Id, String stud_Name, long stud_Marks) {
		super();
		this.stud_Id = stud_Id;
		this.stud_Name = stud_Name;
		this.stud_Marks = stud_Marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stud_Id=" + stud_Id + ", stud_Name=" + stud_Name + ", stud_Marks=" + stud_Marks + "]";
	}

}

public class Task2 {
	static ArrayList<Student> students = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void add() {
		System.out.println("Enter the Student ID: ");
		long id = sc.nextLong();
		for (Student s : students) {
			if (s.getStud_Id() == id) {
				System.out.println("Student with this ID already exists.");
				return;
			}
		}
		System.out.println("Enter the Student Name: ");
		String name = sc.next();
		System.out.println("Enter the Student Marks: ");
		long marks = sc.nextLong();
		students.add(new Student(id, name, marks));
		System.out.println("Student is sucessfully added..!");
	}

	public static void show() {
		if (students.isEmpty()) {
			System.out.println("There is no student record");
			return;
		}
		System.out.println("---Student List---");
		for (Student student : students) {
			System.out.println("Students: " + student);
		}
	}

	public static void update() {
		System.out.println("Enter the id you want to update");
		long id = sc.nextLong();
		boolean found = false;
		for (Student s : students) {
			if (s.getStud_Id() == id) {
				System.out.println("Enter the new Name: ");
				String newName = sc.next();
				System.out.println("Enter the new Marks: ");
				long newMarks = sc.nextLong();
				s.setStud_Name(newName);
				s.setStud_Marks(newMarks);
				System.out.println("Student is sucessfully updated..!");
				found = true;
			}
		}
		if (found != true) {
			System.out.println("Student not found");
		}

	}

	public static void delete() {
		System.out.println("Enter the id you want to delete: ");
		long id = sc.nextLong();
		boolean found = false;

		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getStud_Id() == id) {
				it.remove();
				System.out.println("Student sucessfully deleted");
				found = true;
				break;
			}
		}

		if (found != true) {
			System.out.println("Student not found");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====Student Record Management System===== \n");
		int choice;
		do {
			System.out.println("Enter the choice to perform: ");
			System.out
					.println(" 1. ADD STUDENT \n 2. VIEW STUDENT \n 3. UPDATE STUDENT \n 4. DELETE STUDENT \n 5. EXIT");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				add();
				break;
			}
			case 2: {
				show();
				break;
			}
			case 3: {
				update();
				break;
			}
			case 4: {
				delete();
				break;
			}
			case 5: {
				System.out.println(" User Exited..!");
				System.exit(0);
			}
			}
		} while (choice < 5);
	}
}
