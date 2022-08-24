package dto;

public class DocumentType {

    private String id;
    private Number number;

    public DocumentType() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Number getNumber() {
        return number;
    }
    public void setNumber(Number number) {
        this.number = number;
    }

    //ToString
    @Override
    public String toString() {
        return "DocumentType{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
