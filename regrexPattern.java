package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name : ");
		String firstName = sc.nextLine();
	
		
		
		boolean validatefirstName  = Pattern.matches("[A-Z][a-z]{3}" , firstName);  
	
		if (validatefirstName) {
		System.out.println("firstname is correct ");
	} else {
		System.out.println("firstname is incorrect ");
	}
	}

}
