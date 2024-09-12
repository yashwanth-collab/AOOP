package com.example;
public class ContactManager {
    private java.util.Set<Contact> contacts;
    private java.util.Map<String, Contact> contactMap;

    public ContactManager() {
        contacts = new java.util.HashSet<>();
        contactMap = new java.util.HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            contactMap.put(contact.getPhoneNumber(), contact);
        }
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return contactMap.get(phoneNumber);
    }

    public boolean hasContact(Contact contact) {
        return contacts.contains(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
        contactMap.remove(contact.getPhoneNumber());
    }
}