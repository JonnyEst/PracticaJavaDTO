package dto;

public class Number {

    private Integer idNumber;
    private String descriptionNumber;

    public Number() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public Integer getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }
    public String getDescriptionNumber() {
        return descriptionNumber;
    }
    public void setDescriptionNumber(String descriptionNumber) {
        this.descriptionNumber = descriptionNumber;
    }

    //ToString
    @Override
    public String toString() {
        return "Number{" +
                "idNumber=" + idNumber +
                ", descriptionNumber='" + descriptionNumber + '\'' +
                '}';
    }
}
