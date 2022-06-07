package com.p2;


import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of students :");
		int Number = input.nextInt();
		Student[] arr = new Student[Number];
		int totalMarks = 0;
		System.out.println("================================================");
		for(int i = 0; i < Number; i++) {
			System.out.println("Enter the Roll no. of Student " + (i + 1) + " : ");
			int roll = input.nextInt();
			System.out.println("Enter the Name of Student " + (i + 1) + " : ");
			String name = input.next();
			input.nextLine();
			System.out.println("Enter the Address no. of Student " + (i + 1) + " : ");
			String address = input.nextLine();
			System.out.println("Enter the Marks of Student " + (i + 1) + " : ");
			int marks = input.nextInt();
			
			Student student = new Student();
			
			student.setRoll(roll);
			student.setName(name);
			student.setAddress(address);
			student.setMarks(marks);
			
			totalMarks += marks;
			arr[i] = student;
			System.out.println("**************************************************");
		}
		for(int i = 0; i < arr.length; i++) {
			
			
			System.out.println("Roll no. of  Student " + (i + 1) + " is " + arr[i].getRoll());
			System.out.println("Name of the Student " + (i + 1) + " is " + arr[i].getName());
			System.out.println("Address of the Student " + (i + 1) + " is " + arr[i].getAddress());
			System.out.println("Marks of the Student " + (i + 1) + " is " + arr[i].getMarks());
			System.out.println("");
		}
		System.out.println("Average Marks Of All Students Is " + ((double)totalMarks/arr.length));
	}
}