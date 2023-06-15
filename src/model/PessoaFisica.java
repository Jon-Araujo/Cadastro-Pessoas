package model;
import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable{
    long cpf;
    int idade;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void exibir (int id, String nome, long cpf, int idade) {
        System.out.println("Id: "+ id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}
