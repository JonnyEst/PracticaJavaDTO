package dto;


public class ContactDetails {

    private Contacts contacts;

    public ContactDetails() {
        //constructor
    }

    //GETTERS AND SETTERS
    public Contacts getContacts() {
        return contacts;
    }
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    //ToString
    @Override
    public String toString() {
        return "ContactDetails{" +
                "contacts=" + contacts +
                '}';
    }
}
