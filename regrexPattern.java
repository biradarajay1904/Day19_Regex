package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String password = sc.nextLine();
		boolean validatePassword  = Pattern.matches("^(?=.*[a-z]).{8,}$", password );  
		if (validatePassword) {
		System.out.println("password is correct ");
	} else {
		System.out.println("password is incorrect ");
	}
	}

}
