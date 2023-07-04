package model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class RecuperaObjeto {
    public static Object restaurar(String caminho) {
        Object objeto = null;
        try {
            FileInputStream recuperaObjeto = new FileInputStream(caminho);
            ObjectInputStream stream = new ObjectInputStream(recuperaObjeto);

            objeto = stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }
}
