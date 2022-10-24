import org.junit.jupiter.api.Test;

import java.io.IOException;

class ContactServiceTest {

    // Create contactservice object
    ContactService contactService = new ContactService();
    //Create new contacts




    @Test
    void addContact() throws IOException {
        Contact C1 = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");

        // Add contacts to service
        if (contactService.addContact(C1)) {
            System.out.println("C1 added");
        } else {
            System.out.println("C1 NOT added");
        }

        // Try to add again C1, should print not added.
        if (contactService.addContact(C1)) {
            System.out.println("C1 added");
        } else {
            System.out.println("C1 NOT added");
        }
    }

    @Test
    void displayAllContacts() throws IOException {
        Contact C1 = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");

        contactService.addContact(C1);

        // Show all the contacts
        contactService.displayAllContacts();

    }

    @Test
    void deleteContact() throws IOException {
        Contact C1 = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");

        contactService.addContact(C1);

        //Delete a contact
        if(contactService.deleteContact("C1")) {
            System.out.println("Deleted C1");
        }
        else {
            System.out.println("Deleted C1");
        }

    }

    @Test
    void updateContact() throws IOException {
        Contact C1 = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");

        contactService.addContact(C1);

        //Update C2 contact details
        contactService.updateContactFirstName("C1", "Johnathan");
        contactService.updateContactLastName("C1", "Rand");
        contactService.updateContactNumber("C1", "1234567891");
        contactService.updateContactAddress("C1", "North Pole, World");

        // Show contact
        System.out.println();
        contactService.displayAllContacts();
    }
}