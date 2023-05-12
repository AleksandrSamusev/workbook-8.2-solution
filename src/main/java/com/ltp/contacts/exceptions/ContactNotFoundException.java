package com.ltp.contacts.exceptions;

public class ContactNotFoundException extends RuntimeException{
    public ContactNotFoundException(String id) {
        super("This id: '" + id + "' does not exists in our records");
    }
}
