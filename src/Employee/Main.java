package Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = generateData2();
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
}
