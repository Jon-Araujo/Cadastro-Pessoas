package model;
import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable{
    long cnpj;


    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public static void exibir(int id, String nome, long cnpj) {
        System.out.println("Id: "+ id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cnpj);
    }
}
