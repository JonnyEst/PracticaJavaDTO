package Employee;

import java.util.List;

public class ContactList {

    private List<Contact> ltsContacts;

    public ContactList() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public List<Contact> getLtsContacts() {
        return ltsContacts;
    }
    public void setLtsContacts(List<Contact> ltsContacts) {
        this.ltsContacts = ltsContacts;
    }

    //ToString
    @Override
    public String toString() {
        return "ContactList{" +
                "ltsContacts=" + ltsContacts +
                '}';
    }
}
