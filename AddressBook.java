package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook implements IAddressBook {
    Scanner scan =  new Scanner(System.in);
    Contact contacts[] = new Contact[3];
    public Contact createContact(){
        Contact contact =  new Contact();
        System.out.println("Enter the First Name : ");
        String first_name = scan.next();
        contact.setFirst_name(first_name);
        System.out.println("Enter the Last Name  : ");
        String last_name = scan.next();
        contact.setLast_name(last_name);
        System.out.println("Enter City : ");
        String city = scan.next();
        contact.setCity(city);
        System.out.println("Enter Address : ");
        String address = scan.next();
        contact.setAddress(address);
        System.out.println("Enter State : ");
        String state = scan.next();
        contact.setState(state);
        System.out.println("Enter Zip : ");
        int zip = scan.nextInt();
        contact.setZip(zip);
        System.out.println("Enter Phone Number : ");
        long phoneNum = scan.nextLong();
        contact.setPhoneNum(phoneNum);
        System.out.println("Enter your Email : ");
        String email = scan.next();
        contact.setEmail(email);
        System.out.println(contact);
        return contact;
    }
    @Override
    public void addContact(){
        for(int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
        Contact newContact = createContact();
        boolean isNullPlace = false;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].equals(null)){
                contacts[i] = newContact;
                isNullPlace = true;
            }
        }
        if(isNullPlace == false){
            System.out.println("Address Book is already full");
        }
        else {
            System.out.println("Contacts added successfully");
        }
    }
}