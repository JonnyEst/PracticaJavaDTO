package documents;

public class Documents {

    private String code;
    private String type;
    private Integer status;

    public Documents() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
