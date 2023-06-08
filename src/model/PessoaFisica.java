package model;
import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable{
    String cpf;
    int idade;

    public PessoaFisica(int id, String texto, String cpf, int idade) {
        super(id, texto);
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void exibir () {

    }
}
