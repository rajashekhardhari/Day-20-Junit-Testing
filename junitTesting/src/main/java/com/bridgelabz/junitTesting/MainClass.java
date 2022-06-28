package com.bridgelabz.junitTesting;

import java.util.Scanner;

import com.bridgelabz.junitTesting.CustomException.CheckPattern;

public class MainClass {

	public static void main(String[] args) throws CustomException {
		CheckPattern checkPatterns = new CheckPattern();
		System.out.println("Welcome to User Resgistration::");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First name:");
		try {
			String fname = scanner.nextLine();
			checkPatterns.check(fname);

			System.out.print("Enter Last name:");
			String lname = scanner.nextLine();
			checkPatterns.check(lname);
			System.out.print("Enter email address:");
			String email = scanner.next();
			checkPatterns.mail(email);
			System.out.print("Enter Mobile Number:");
			String mobile = scanner.next();
			checkPatterns.mobile(mobile);
			System.out.println("Enter 8-digit password");
			String password = scanner.next();
			checkPatterns.passwords(password);
			System.out.println("Registration successfull...");
		} catch (CustomException e) {
			System.out.println("[" + e + "] Exception Occured");
		}
	}
}
