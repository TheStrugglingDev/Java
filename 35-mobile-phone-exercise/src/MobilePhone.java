import com.strugglingdev.Contact;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null) {
            return false;
        }
        return findContact(contact) < 0 && myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (oldContact == null || newContact == null) {
            return false;
        }

        int oldIndex = findContact(oldContact);
        if (oldIndex < 0) {
            return false;
        }

        // If the new name already exists in a different contact, reject
        int existingIndex = findContact(newContact.getName());
        if (existingIndex >= 0 && existingIndex != oldIndex) {
            return false;
        }

        myContacts.set(oldIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            return false;
        }
        myContacts.remove(index);
        return true;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index < 0) {
            return null;
        }
        return myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            System.out.println((i + 1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        if (contact == null) {
            return -1;
        }
        return findContact(contact.getName());
    }

    private int findContact(String contactName) {
        if (contactName == null) {
            return -1;
        }
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
