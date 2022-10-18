package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<AddressBook> BookList = new ArrayList<AddressBook>();
	
	public void NewBook() {
		System.out.println("Add Multiple Address Books");
		System.out.println("Please Enter how many Books You want");
		int book = sc.nextInt();
		for (int i=0;i<book;i++) {
			AddressBook book1 = new AddressBook();
			System.out.println("Please Enter BookName");
			book1.setBookName(sc.next());
			System.out.println("===============");
			BookList.add(book1);
			AddressBook addressList = new AddressBook() ;
			addressList.addContact();
			addressList.editContact();
			addressList.deleteContact();	
		}

	}

	public static ArrayList<AddressBook> getBookList() {
		return BookList;
	}

	public static void setBookList(ArrayList<AddressBook> bookList) {
		BookList = bookList;
	}

}
