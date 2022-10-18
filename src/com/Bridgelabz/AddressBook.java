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
		public void addContact(){
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

			addressBook.add(person1);
			
			System.out.println("-------------------------------");
			
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
			
			PersonDetails person2 = new PersonDetails(firstName, lastName, address, city, state, zipNo, phoneNo);
			addressBook.add(person2);
			System.out.print(addressBook);
			System.out.println("successfully added person new contacts");
			
		}
		
		public void editContact() {
			System.out.println("enter a name for edit:");
			String editName = sc.next();
			for (int i = 0; i < addressBook.size(); i++) {
				if (addressBook.get(i).getFirstName().equals(editName)) {
					System.out.println("select options");
					System.out.println("\n0.First Name\n1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone Number");
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
		public void deleteContact() {
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
