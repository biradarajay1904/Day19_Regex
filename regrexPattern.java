package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regrexPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Last name : ");
		//String LastName = sc.nextLine();
		//System.out.println("Enter the Phone number : ");
		//String phoneNumber = sc.nextLine();
	//email pattern	"^[a-z](.+)@(\\S+)$"
		//System.out.println("Enter the Email address : ");
		//String Email = sc.nextLine();
		//boolean validateLastName  = Pattern.matches("^((91){1})? ?[0-9]{9}$", phoneNumber);  
		//System.out.println(validateLastName );
		//boolean validateEmail = Pattern.matches("^[a-z](.+)@(\\S+)$", Email);  
		//System.out.println(validateEmail );
		System.out.println("Enter the Password : ");
		String password = sc.nextLine();
boolean  validatePassword  = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])(?=.*[0-9]).{8,}$", password );  
		if (validatePassword) {
		System.out.println("password is correct ");
	} else {
		System.out.println("password is incorrect ");
	}
	}

}
