package Employee;

import java.util.ArrayList;
import java.util.List;

import dto.Contacts;
import dto.InfoUsers;

public class Main {
    public static void main(String[] args) {

        dto.Main main = new dto.Main();
        InfoUsers infoUsers = main.generateData();

        Employee employee = mapeo(infoUsers);

        System.out.println(employee.toString());


    }

    public static Employee generateData(){
        Documento documento = new Documento();
        documento.setTipo("NIF");
        documento.setDescripcion("Hola mundo");
        documento.setNumber(123);

        Contact contact = new Contact();
        contact.setNumber("3102392010");
        contact.setTypoContacto("MOBILE");

        Contact contact2 = new Contact();
        contact.setNumber("3129379820");
        contact.setTypoContacto("MOBILE");

        List<Contact> ltsContact = new ArrayList<>();
        ltsContact.add(contact);
        ltsContact.add(contact2);

        ContactList contactList = new ContactList();
        contactList.setLtsContacts(ltsContact);

        DatosContacto datosContacto = new DatosContacto();
        datosContacto.setDatoDeContacto("SI");
        datosContacto.setContactList(contactList);

        Employee employee = new Employee();
        employee.setNombreCompleto("Cristian Stiven Sanchez");
        employee.setSufijo("SR");
        employee.setDatosContacto(datosContacto);
        employee.setDocumento(documento);

        return employee;
    }


    public static Employee generateData2(){
        Employee employee = new Employee();
        List<Contact> ltsContact = new ArrayList<>();
        for(int i=0;i<=20;i++){
            Contact contact = new Contact();

            contact.setNumber("000000"+i);
            contact.setTypoContacto("MOBILE"+i);
            ltsContact.add(contact);
        }
        ContactList contactList = new ContactList();
        contactList.setLtsContacts(ltsContact);

        DatosContacto datosContacto = new DatosContacto();
        datosContacto.setDatoDeContacto("SI");
        datosContacto.setContactList(contactList);

        employee.setNombreCompleto("Cristian Stiven Sanchez");
        employee.setSufijo("SR");
        employee.setDatosContacto(datosContacto);

        return employee;
    }


    public static Employee mapeo(InfoUsers infoUsers){
        Employee employee = new Employee();
        DatosContacto datosContacto = new DatosContacto();
        Contacts contacts = new Contacts();
        employee.setNombreCompleto(infoUsers.getFirstName()+" "+infoUsers.getMiddleName()
                                    +" "+infoUsers.getLastName()+" "+infoUsers.getSecondLastName());
        employee.setSufijo(infoUsers.getSuffix());
        if(infoUsers.getContactDetails()!=null){
            datosContacto.setDatoDeContacto("SI");
            employee.setDatosContacto(datosContacto);
        }else{
            datosContacto.setDatoDeContacto("NO");
            employee.setDatosContacto(datosContacto);
        }

        Contact contact = new Contact();
        contact.setNumber(infoUsers.getContactDetails().getContacts().getNumber());
        contact.setTypoContacto(infoUsers.getContactDetails().getContacts().getContactDetailType());

        List<Contact> ltsContact = new ArrayList<>();
        ltsContact.add(contact);

        ContactList contactList = new ContactList();
        contactList.setLtsContacts(ltsContact);

        datosContacto.setContactList(contactList);

        employee.setDatosContacto(datosContacto);

        Documento documento = new Documento();
        documento.setTipo(infoUsers.getIdentifyDocuments().getDocumentType().getId());
        documento.setDescripcion(infoUsers.getIdentifyDocuments().getDocumentType().getNumber().getDescriptionNumber());
        documento.setNumber(infoUsers.getIdentifyDocuments().getDocumentNumber());

        employee.setDocumento(documento);

        return employee;
    }

}
