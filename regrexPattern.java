package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Phone number : ");
		String phoneNumber = sc.nextLine();
		
		
		boolean validatephoneNumber = Pattern.matches("^((91){1})? ?[0-9]{9}$", phoneNumber);  
		if (validatephoneNumber) {
		System.out.println("phone number is correct ");
	} else {
		System.out.println("phone number is incorrect ");
	}
	}

}
