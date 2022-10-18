package com.Bridgelabz;

import java.util.Scanner;

public class PersonDetails {
	
	String firstName;
	String lastName;
	String address;
	 String city;
	String state;
	int zipNo;
	long phoneNo;
	static Scanner sc = new Scanner(System.in);

	public PersonDetails() {

		System.out.println("Enter firstName");
		firstName =sc.next();
		
		System.out.println("Enter LastName");
		lastName =sc.next();
		
		System.out.println("Enter Address");
		address =sc.next();
		
		System.out.println("Enter City");
		city =sc.next();
		
		System.out.println("Enter State");
		state =sc.next();
		
		System.out.println("Enter Zip");
		zipNo =sc.nextInt();
		
		System.out.println("Enter phoneNumber");
		phoneNo =sc.nextLong();
	}

	
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println( "Person Details" );
		System.out.println("FirstName = "+ firstName);
		System.out.println("Address = "+ address);
		System.out.println("city = "+ city);
		System.out.println("state = "+ state);
		System.out.println("zip = " +zipNo);
		System.out.println("phoneNumber =" + phoneNo);
	}

}
