package Employee;

public class DatosContacto {

    private String datoDeContacto;
    private ContactList contactList;

    public DatosContacto() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getDatoDeContacto() {
        return datoDeContacto;
    }
    public void setDatoDeContacto(String datoDeContacto) {
        this.datoDeContacto = datoDeContacto;
    }
    public ContactList getContactList() {
        return contactList;
    }
    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    //ToString
    @Override
    public String toString() {
        return "DatosContacto{" +
                "datoDeContacto='" + datoDeContacto + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
