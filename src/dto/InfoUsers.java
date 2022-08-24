package dto;

public class InfoUsers {

    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private String suffix;
    private ContactDetails contactDetails;
    private IdentifyDocuments identifyDocuments;

    public InfoUsers() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSecondLastName() {
        return secondLastName;
    }
    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    public IdentifyDocuments getIdentifyDocuments() {
        return identifyDocuments;
    }
    public void setIdentifyDocuments(IdentifyDocuments identifyDocuments) {
        this.identifyDocuments = identifyDocuments;
    }

    //ToString
    @Override
    public String toString() {
        return "InfoUsers{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", contactDetails=" + contactDetails +
                ", identifyDocuments=" + identifyDocuments +
                '}';
    }
}
