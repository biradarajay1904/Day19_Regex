package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Email address : ");
		String Email = sc.nextLine();
		boolean validateEmail = Pattern.matches("^[a-z](.+)@_-(\\S+)$", Email);  
		
		if ( validateEmail) {
		System.out.println("password is correct ");
	} else {
		System.out.println("password is incorrect ");
	}
	}

}
