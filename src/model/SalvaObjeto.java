package model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SalvaObjeto {
    public static void salvar(Object objeto, String caminho) {
        try {
            FileOutputStream salvaArquivo = new FileOutputStream(caminho);
            ObjectOutputStream stream = new ObjectOutputStream(salvaArquivo);

            stream.writeObject(objeto);
            stream.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
