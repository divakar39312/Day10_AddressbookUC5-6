package com.Bridgelabz;

import java.util.Scanner;

public class AddressBook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plase Enter No of Persons You Want To Add in your Address Book");
		int numOfPersons = sc.nextInt();
		PersonDetails[] personsList = new PersonDetails[numOfPersons];
		
		for(int i = 0; i<numOfPersons; i++) {
		System.out.println("Enter firstName");
		String firstName =sc.next();
		
		System.out.println("Enter LastName");
		String lastName =sc.next();

		System.out.println("Enter Address");
		String address =sc.next();
		
		System.out.println("Enter City");
		String city =sc.next();
		
		System.out.println("Enter State");
		String state =sc.next();

		System.out.println("Enter Zip");
		int zipNo =sc.nextInt();

		System.out.println("Enter phoneNumber");
		long phoneNo =sc.nextLong();
		
		personsList [i]= new PersonDetails(firstName, lastName, address, city, state, zipNo, phoneNo) ;
		}
		for(PersonDetails pd : personsList ) {
		System.out.println(pd.toString());
		}
	
	}

}
