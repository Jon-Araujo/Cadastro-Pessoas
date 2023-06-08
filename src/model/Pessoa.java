package model;
import java.io.Serializable;


public class Pessoa implements Serializable{
    int id;
    String texto;

    public Pessoa(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public static void exibir() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
