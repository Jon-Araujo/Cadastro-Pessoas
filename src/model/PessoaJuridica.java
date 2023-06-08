package model;
import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable{
    String cnpj;

    public PessoaJuridica(int id, String texto, String cnpj) {
        super(id, texto);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
