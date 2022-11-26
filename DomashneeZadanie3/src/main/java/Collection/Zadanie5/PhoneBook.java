package Collection.Zadanie5;

import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    List<Contact> contactList;

    public PhoneBook() {
        this.contactList = new LinkedList<Contact>();
    }
    public void add(String name,String  number){
        if (isNameInDirectory(name)) {
            for (Contact contact: this.contactList) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    String oldPhoneNumber = contact.getNumber();
                    contact.setNumber(oldPhoneNumber+" "+number);
                }
            }
        } else {

        this.contactList.add(new Contact(name,number));
    }}
    public void get(String name){
        if (this.contactList.size() == 0) {
            System.out.println("Телефонный справочник пуст");
        } else if (name != null && name.trim().length() != 0) {
            for (Contact contact : this.contactList) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    System.out.println("Имя: " + contact.getName() + "\n" + "Телефон: " + contact.getNumber());
                    System.out.println("\n");
                }

            }
        }
    }
    public boolean isNameInDirectory (String name) {
        for (Contact contact: this.contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
