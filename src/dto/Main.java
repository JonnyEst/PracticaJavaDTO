package dto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InfoUsers infoUsers = generateData();

        System.out.println(infoUsers.toString()); // Impirmir en consola tipo JSon
    }

    public static InfoUsers generateData(){

        Contacts contacts = new Contacts();
        contacts.setNumber("3102392010");
        contacts.setContactDetailType("MOBILE");

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setContacts(contacts);

        InfoUsers infoUsers = new InfoUsers();
        infoUsers.setContactDetails(contactDetails);

        infoUsers.setFirstName("Manuel");
        infoUsers.setMiddleName("Alberto");
        infoUsers.setLastName("Serrano");
        infoUsers.setSecondLastName("Lopez");
        infoUsers.setSuffix("SR");

        Number number = new Number();
        number.setIdNumber(3);
        number.setDescriptionNumber("Hola mundo");

        DocumentType documentType = new DocumentType();
        documentType.setId("NIF");
        documentType.setNumber(number);

        IdentifyDocuments identifyDocuments = new IdentifyDocuments();
        identifyDocuments.setDocumentNumber(123);
        identifyDocuments.setDocumentType(documentType);

        infoUsers.setIdentifyDocuments(identifyDocuments);

        return infoUsers;
    }
}
