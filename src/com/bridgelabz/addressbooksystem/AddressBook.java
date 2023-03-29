package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook extends Contacts {

	public void addContacts() {
		Scanner scanner = new Scanner(System.in);
		Contacts contacts = new Contacts();

		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		contacts.setFirstName(firstName);

		System.out.println("Enter Last Name: ");
		String lastName = scanner.nextLine();
		contacts.setLastName(firstName);

		System.out.println("Enter Address: ");
		String address = scanner.nextLine();
		contacts.setAddress(address);

		System.out.println("Enter City: ");
		String city = scanner.nextLine();
		contacts.setCity(city);

		System.out.println("Enter State: ");
		String state = scanner.nextLine();
		contacts.setState(state);

		System.out.println("Enter Email: ");
		String email = scanner.nextLine();
		contacts.setEmail(email);

		System.out.println("Enter zip: ");
		int zip = scanner.nextInt();
		contacts.setZip(zip);

		System.out.println("Enter Phone Number: ");
		long phoneNumber = scanner.nextLong();
		contacts.setPhoneNumber(phoneNumber);
	}

}
