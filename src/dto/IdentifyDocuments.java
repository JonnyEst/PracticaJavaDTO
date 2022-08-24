package dto;

public class IdentifyDocuments {

    private DocumentType documentType;
    private Integer documentNumber;

    public IdentifyDocuments() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public DocumentType getDocumentType() {
        return documentType;
    }
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
    public Integer getDocumentNumber() {
        return documentNumber;
    }
    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    //ToString
    @Override
    public String toString() {
        return "IdentifyDocuments{" +
                "documentType=" + documentType +
                ", documentNumber=" + documentNumber +
                '}';
    }
}
