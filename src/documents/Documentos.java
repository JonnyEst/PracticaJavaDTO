package documents;

public class Documentos {

    private String codigo;
    private String tipo;
    private Integer estado;

    public Documentos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
