package dto;

public class Contacts {

    private String number;
    private String contactDetailType;


    public Contacts() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getContactDetailType() {
        return contactDetailType;
    }
    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }

    //To String
   @Override
    public String toString() {
        return "Contacts{" +
                "number='" + number + '\'' +
                ", contactDetailType='" + contactDetailType + '\'' +
                '}';
    }
}
