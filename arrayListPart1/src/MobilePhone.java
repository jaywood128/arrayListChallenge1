import java.util.ArrayList;

public class MobilePhone {
    public static ArrayList<Contact> allContacts = new ArrayList<Contact>();

    public ArrayList<Contact> getAllContacts(){
        return allContacts;
    }
    public ArrayList<Contact>  addContact(String name, long cellNumber, long homeNumber){
        Contact newContact = new Contact(name, cellNumber, homeNumber);
        if(allContacts.indexOf(newContact) < 0){
            privateAddContact(name, cellNumber, homeNumber);
        }
        Contact newestContact = allContacts.get(allContacts.size() - 1);
        System.out.println( newestContact.getName() + " was added to Contacts. There number is: " + newContact.getCellNumber());
        return allContacts;
    }
    public void privateAddContact(String name, long cellNumber, long homeNumber){
        Contact newContact = new Contact(name, cellNumber, homeNumber);
        allContacts.add(newContact);
    }



}


// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, prlonglist of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.