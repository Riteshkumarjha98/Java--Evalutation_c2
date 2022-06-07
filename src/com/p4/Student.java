package com.p4;
import java.util.Scanner;


public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public void setDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name of the Student :");
		name = input.next();
		System.out.println("Enter the Gender of the Student :");
		gender = input.next();
		System.out.println("Enter the Student Id :");
		studentId = input.nextInt();
		System.out.println("Enter the Enrolled course of the Student :");
		courseEnrolled = input.next();
		System.out.println("Enter the Course Fee of the Student :");
		courseFee = input.nextInt();
		System.out.println("Enter the City of Student :");
		address.city = input.next();
		System.out.println("Enter the State of Student :");
		address.state = input.next();
		System.out.println("Enter the Pincode of the Student :");
		address.pinCode = input.next();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}


	
}