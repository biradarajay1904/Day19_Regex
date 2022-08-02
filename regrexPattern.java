package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last name : ");
		String lastName = sc.nextLine();
	
		
		
		boolean validatelastName  = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$",lastName);  
		if (validatelastName) {
		System.out.println("lastname is correct ");
	} else {
		System.out.println("lastname is incorrect ");
	}
	}

}
