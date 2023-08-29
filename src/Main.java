import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Metodos;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> pf = Metodos.restauraObjeto("./dadosPf");
        ArrayList<ArrayList<String>> pj = Metodos.restauraObjeto("./dadosPj");

        int opcao = -1;

        while (opcao != 0) {
            opcao = Metodos.opcoesTerminal();
            if (opcao == 1) {
                String tipoPessoa = Metodos.tipoPessoa();

                if (Objects.equals(tipoPessoa, "f")) {
                    pf = Metodos.opcao1("fisica", pf);
                } else if (Objects.equals(tipoPessoa, "j")) {
                    pj = Metodos.opcao1("juridica", pj);
                }
            } else if (opcao == 2) {
                String tipoPessoa = Metodos.tipoPessoa();
                if (Objects.equals(tipoPessoa, "f")) {
                    pf = Metodos.opcao2("fisica", pf);
                } else if (Objects.equals(tipoPessoa, "j")) {
                    pj = Metodos.opcao2("juridica", pj);
                }
            } else if (opcao == 3) {
                String tipoPessoa = Metodos.tipoPessoa();
                if (Objects.equals(tipoPessoa, "f")) {
                    pf = Metodos.opcao3(pf);
                } else if (Objects.equals(tipoPessoa, "j")) {
                    pj = Metodos.opcao3(pj);
                }
            } else if (opcao == 4) {
                String tipoPessoa = Metodos.tipoPessoa();
                if (Objects.equals(tipoPessoa, "f")) {
                    Metodos.opcao4("fisica", pf);
                } else if (Objects.equals(tipoPessoa, "j")) {
                    Metodos.opcao4("juridica", pj);
                }
            } else if (opcao == 5) {
                String tipoPessoa = Metodos.tipoPessoa();

                if (Objects.equals(tipoPessoa, "f")) {
                    Metodos.opcao5("fisica", pf);
                } else if (Objects.equals(tipoPessoa, "j")) {
                    Metodos.opcao5("juridica", pj);
                }
            } else if (opcao == 6) {
                String tipoPessoa = Metodos.tipoPessoa();

                if (Objects.equals(tipoPessoa, "f")) {
                    Metodos.salvaObjeto(pf, "./dadosPf");
                } else if (Objects.equals(tipoPessoa, "j")) {
                    Metodos.salvaObjeto(pj, "./dadosPj");
                }
            } else if (opcao == 7) {
                String tipoPessoa = Metodos.tipoPessoa();

                if (Objects.equals(tipoPessoa, "f")) {
                    Metodos.restauraObjeto("./dadosPf");
                } else if (Objects.equals(tipoPessoa, "j")) {
                    Metodos.restauraObjeto("./dadosPj");
                }

                System.out.println("Dados recuperados com sucesso!");
            }
        }
    }
}
