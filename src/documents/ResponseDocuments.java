package documents;

import java.util.List;

public class ResponseDocuments {

    private List<Documents> ltsDocuments;

    public ResponseDocuments() {
    }

    public List<Documents> getLtsDocuments() {
        return ltsDocuments;
    }

    public void setLtsDocuments(List<Documents> ltsDocuments) {
        this.ltsDocuments = ltsDocuments;
    }

    @Override
    public String toString() {
        return "ResponseDocuments{" +
                "ltsDocuments=" + ltsDocuments +
                '}';
    }
}
