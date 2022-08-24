package Employee;

public class Documento {

    private String tipo;
    private String descripcion;
    private Integer number;

    public Documento() {
        //Constructor
    }

    //GETTERS AND SETTERS
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    //ToString
    @Override
    public String toString() {
        return "Documento{" +
                "tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", number=" + number +
                '}';
    }
}
