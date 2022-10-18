package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<PersonDetails> addressBook = new ArrayList<PersonDetails>();

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to Address Book Program");
		
			AddressBook addressList = new AddressBook();
			System.out.println("");
					addressList.addContact();
					addressList.editContact();
					addressList.deleteContact();	
		}
		
		//Add Contact Method
		public void addContact(){
			System.out.println("Add (Multiple) Contact");
			System.out.println("Please Enter how mnay Contacts You want");
			int max = sc.nextInt();
			// For Multiple Contacts Enter How many You want 
			for (int i=0;i<=max;i++) {
			PersonDetails person1 = new PersonDetails();
				
			System.out.println("Enter a first name:");
			person1.setFirstName(sc.next());

			System.out.println("Enter a last name:");
			person1.setLastName(sc.next());

			System.out.println("Enter a Address:");
			person1.setAddress(sc.next());

			System.out.println("Enter a City name:");
			person1.setCity(sc.next());

			System.out.println("Enter a state:");
			person1.setState(sc.next());

			System.out.println("Enter a zip code:");
			person1.setZipNo(sc.nextInt());

			System.out.println("Enter a phone number:");
			person1.setPhoneNo(sc.nextLong());
			System.out.println("===================================");
			addressBook.add(person1);
		}
			System.out.print(addressBook);
			System.out.println("successfully added person new contacts");
			
		}
		// Edit Contact Method
		public void editContact() {
			System.out.println("Edit Contact");
			System.out.println("enter a name for edit:");
			String editName = sc.next();
			for (int i = 0; i < addressBook.size(); i++) {
				if (addressBook.get(i).getFirstName().equals(editName)) {
					System.out.println("select options");
					System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number");
					int editOption = sc.nextInt();
					// System.out.println("message"+editOption);
					switch (editOption) {
					case 1:
						System.out.println("Enter a First name:");
						String editFirstName = sc.next();
						addressBook.get(i).setFirstName(editFirstName);
						System.out.println(editFirstName);
						break;
					case 2:
						System.out.print("Enter a Last name:");
						addressBook.get(i).setLastName(sc.next());
						break;
					case 3:
						System.out.print("Enter a Address:");
						addressBook.get(i).setAddress(sc.next());
						break;
					case 4:
						System.out.print("Enter a city:");
						addressBook.get(i).setCity(sc.nextLine());
						break;
					case 5:
						System.out.print("Enter a state:");
						addressBook.get(i).setState(sc.nextLine());
						break;
					case 6:
						System.out.print("Enter a zip code:");
						addressBook.get(i).setZipNo(sc.nextInt());
						break;
					case 7:
						System.out.print("Enter a phone number:");
						addressBook.get(i).setPhoneNo(sc.nextLong());
						break;
					default:
						System.out.println("enter valid contact");
					}
				}
				System.out.println("Edited list is:");
				System.out.println(addressBook);
			}
		}	
		// Delete Contact Method
		public void deleteContact() {
			System.out.println("Delete Contact");
			System.out.println("confirm the name to delete contact");
			String confirmName = sc.next();
			for (int i = 0; i < addressBook.size(); i++) {
				if (addressBook.get(i).getFirstName().equals(confirmName))
					;
				PersonDetails person = addressBook.get(i);
				addressBook.remove(person);
			}
			System.out.println(addressBook);
		}
}
