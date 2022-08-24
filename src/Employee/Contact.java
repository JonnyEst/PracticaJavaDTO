package Employee;

public class Contact {
    private String number;
    private String typoContacto;

    public Contact() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getTypoContacto() {
        return typoContacto;
    }
    public void setTypoContacto(String typoContacto) {
        this.typoContacto = typoContacto;
    }

    //ToString
    @Override
    public String toString() {
        return "Contact{" +
                "number='" + number + '\'' +
                ", typoContacto='" + typoContacto + '\'' +
                '}';
    }
}
