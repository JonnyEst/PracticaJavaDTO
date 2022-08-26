package documents;

import java.util.List;

public class Info {

    private List<Documents> documents;
    private String name;

    public Info() {
    }

    public List<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Documents> documents) {
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "documents=" + documents +
                ", name='" + name + '\'' +
                '}';
    }
}
