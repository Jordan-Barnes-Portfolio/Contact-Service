import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void setFirstName() throws IOException {
        Contact contact = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");
        //Testing get and set methods
        contact.setFirstName("Jason");
        assertEquals(contact.getFirstName(), "Jason");
    }

    @Test
    void setLastName() throws IOException {
        Contact contact = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");
        //Testing get and set methods
        contact.setLastName("Jason");
        assertEquals(contact.getLastName(), "Jason");
    }

    @Test
    void setPhoneNumber() throws IOException {
        Contact contact = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");
        //Testing get and set methods
        contact.setPhoneNumber("1234567890");
        assertEquals(contact.getPhoneNumber(), "1234567890");
    }

    @Test
    void setAddress() throws IOException {
        Contact contact = new Contact("C1", "Jason", "Bond", "9182921692", "Make it up, USA");
        //Testing get and set methods
        contact.setAddress("123 Make it up way, USA");
        assertEquals(contact.getAddress(), "123 Make it up way, USA");
    }

}