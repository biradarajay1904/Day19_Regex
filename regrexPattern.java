package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last name : ");
		String LastName = sc.nextLine();
	
		
		
		boolean validateLastName  = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$",LastName);  
		System.out.println(validateLastName );
	}

}
