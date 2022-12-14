package documents;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        App app = new App();
        Info info = app.dataFilling();
        System.out.println(info.toString());

        Informacion informacion = app.metodoRespuesta(info);
        System.out.println(informacion.toString());

    }

    public static Info dataFilling() {
        Info info = new Info();
        List<Documents> ltsResponseDocs = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Documents documents = new Documents();

            info.setName("ASO");
            documents.setCode("121637191320458543"+i);
            documents.setType("Pdf");
            documents.setStatus(2);
            ltsResponseDocs.add(documents);
        }
        info.setDocuments(ltsResponseDocs);

        return info;
    }

    public static Informacion metodoRespuesta(Info info){
        Informacion informacion = new Informacion();
        List<Documentos> listaDocumentos = new ArrayList<>();
        for(int i=0; i <= 10; i++){
            Documentos documentos = new Documentos();

            documentos.setCodigo(info.getDocuments().get(i).getCode());
            documentos.setTipo(info.getDocuments().get(i).getType());
            documentos.setEstado(info.getDocuments().get(i).getStatus());
            informacion.setNombre(info.getName());
            listaDocumentos.add(documentos);
        }
        informacion.setDocumentos(listaDocumentos);

        return informacion;
    }
}
