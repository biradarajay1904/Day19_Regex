package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Last name : ");
		//String LastName = sc.nextLine();
		System.out.println("Enter the Phone number : ");
		String phoneNumber = sc.nextLine();
		
		
		boolean validateLastName  = Pattern.matches("((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6} ", phoneNumber);  
		System.out.println(validateLastName );
	}

}
