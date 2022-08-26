package documents;

import java.util.List;

public class Informacion {

    private List<Documentos> documentos;
    private String nombre;

    public Informacion() {
    }

    public List<Documentos> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documentos> documentos) {
        this.documentos = documentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Informacion{" +
                "documentos=" + documentos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
