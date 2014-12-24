package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {
	private static final int MAX_CONTACTS = 50000;
	private static Contact[] myContactList  = new Contact[MAX_CONTACTS];
	private static int contactCount = 0;
	
	public static void main(String[] args) {
		File contactsFile = new File("contacts.csv");
		parseFile(contactsFile);
		
		System.out.println("------------ Done parsing -----------");
		printAllContacts();
		
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Enter a name to search for: ");
		String input = mScanner.nextLine();
		Contact result = search(input);
		if(result != null){
			System.out.println(result.toString());
		} else {
			System.out.println("Nada... couldn't find anyone with that name");
		}
	}
	
	public static void createContact(String line){
		String[] content = line.split(",");
		
		String name = content[0];
		String email = content[1];
		String phoneNumber = content[2];
		
		Contact contact = new Contact(name, email, phoneNumber);
		addContactToContactList(contact);
	}
	
	public static void addContactToContactList(Contact contact){
		myContactList[contactCount] = contact;
		contactCount++;
	}

	public static void parseFile(File myFile) {
		try {
			FileReader myFileReader = new FileReader(myFile);
			BufferedReader myReader = new BufferedReader(myFileReader);
			String lineOfText;
			while ((lineOfText = myReader.readLine()) != null) {
				createContact(lineOfText);
				//System.out.println(lineOfText);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Something happened. That's all i know...");
		} catch (IOException e) {
			System.out.println("Some bad IO happened. That's all i know...");
		}
	}
	
	public static void printAllContacts(){
		for(int i = 0; i < contactCount; i++){
			System.out.println(myContactList[i].toString());
		}
	}
	
	public static Contact search(String name){
		for(int i = 0; i < contactCount; i++){
			Contact mContact = myContactList[i];
			if(mContact.getName().equals(name)){
				return mContact;
			}
		}
		return null;
	}
}
