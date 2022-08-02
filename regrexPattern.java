package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Email address : ");
		String Email = sc.nextLine();
		
		boolean validateEmail = Pattern.matches("^[a-z](.+)@(\\S+)$", Email);  
		System.out.println(validateEmail );
	}

}
