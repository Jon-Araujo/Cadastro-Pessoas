import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> pf = new ArrayList<String[]>();
        ArrayList<String[]> pj = new ArrayList<String[]>();


        Pessoa.msg("Fisica");

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setId(1);
        pf1.setNome("Ana");
        pf1.setCpf(11111111111L);
        pf1.setIdade(25);
        PessoaFisica.exibir(pf1.getId(), pf1.getNome(), pf1.getCpf(), pf1.getIdade());
        pf.add(new String[]{String.valueOf(pf1.getId()), pf1.getNome(), String.valueOf(pf1.getCpf()), String.valueOf(pf1.getIdade())});

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setId(2);
        pf2.setNome("Carlos");
        pf2.setCpf(22222222222L);
        pf2.setIdade(52);
        PessoaFisica.exibir(pf2.getId(), pf2.getNome(), pf2.getCpf(), pf2.getIdade());
        pf.add(new String[]{String.valueOf(pf2.getId()), pf2.getNome(), String.valueOf(pf2.getCpf()), String.valueOf(pf2.getIdade())});


        Pessoa.msg("Juridica");

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setId(1);
        pj1.setNome("XPTO Sales");
        pj1.setCnpj(33333333333L);
        PessoaJuridica.exibir(pj1.getId(), pj1.getNome(), pj1.getCnpj());
        pj.add(new String[]{String.valueOf(pj1.getId()), pj1.getNome(), String.valueOf(pj1.getCnpj())});


        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setId(2);
        pj2.setNome("XPTO Solutions");
        pj2.setCnpj(44444444444L);
        PessoaJuridica.exibir(pj2.getId(), pj2.getNome(), pj2.getCnpj());
        pj.add(new String[]{String.valueOf(pj2.getId()), pj2.getNome(), String.valueOf(pj2.getCnpj())});

        System.out.println("""
                ================================================
                1 - Incluir Pessoa
                2 - Alterar Pessoa
                3 - Excluir Pessoa
                4 - Buscar pelo Id
                5 - Exibir Todos
                6 - Persistir Dados
                7 - Recuperar Dados
                0 - Finalizar Programa
                ================================================
                """);

        Scanner input = new Scanner(System.in);
        Scanner tipo = new Scanner(System.in);
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            Scanner nome = new Scanner(System.in);
            Scanner doc = new Scanner(System.in);
            Scanner idade = new Scanner(System.in);

            String tipoPessoa = tipo.nextLine();
            if (Objects.equals(tipoPessoa,"F") || Objects.equals(tipoPessoa,"f")) {
                int id = pf.size() + 1;
                System.out.println("Informe o Nome:");
                String n = nome.nextLine();
                System.out.println("Informe o CPF:");
                long cpf = doc.nextLong();
                System.out.println("informe a idade:");
                int age = idade.nextInt();

                pf.add(new String[]{String.valueOf(id), n, String.valueOf(cpf), String.valueOf(age)});
                for (int i = 0; i < pf.size(); i++) {
                    System.out.println(Arrays.toString(pf.get(i)));
                }
            } else if (Objects.equals(tipoPessoa, "J") || Objects.equals(tipoPessoa, "j")) {
                int id = pj.size() + 1;
                System.out.println("Informe o Nome:");
                String n = nome.nextLine();
                System.out.println("Informe o CNPJ:");
                long cnpj = doc.nextLong();

                pj.add(new String[]{String.valueOf(id), n, String.valueOf(cnpj)});
                for (int i = 0; i < pj.size(); i++) {
                    System.out.println(Arrays.toString(pj.get(i)));
                }
            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 2) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            String tipoPessoa = tipo.nextLine();
            Scanner nome = new Scanner(System.in);
            Scanner doc = new Scanner(System.in);
            Scanner idade = new Scanner(System.in);
            if (Objects.equals(tipoPessoa, "F") || Objects.equals(tipoPessoa, "f")) {
                System.out.println("Selecione a pessoa que deseja alterar:");
                for (int i = 0; i < pf.size(); i++) {
                    System.out.println(i + " - " + pf.get(i)[1]);
                }
                Scanner altera = new Scanner(System.in);
                int id = altera.nextInt();

                for (int i = 0; i < pf.size(); i++) {
                    if (id == i) {
                        System.out.println("Realize as alterações de " + pf.get(i)[1] + ":");
                        String n = nome.nextLine();
                        long cpf = doc.nextLong();
                        int age = doc.nextInt();

                        String[] lista = new String[]{n, String.valueOf(cpf), String.valueOf(age)};
                        pf.add(i, lista);

                        System.out.println(pf.get(i)[0] + pf.get(i)[1] + pf.get(i)[2]);
                    }
                }

            } else if (Objects.equals(tipoPessoa, "J") || Objects.equals(tipoPessoa, "j")) {

            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 3) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            String tipoPessoa = input.nextLine();
            if (tipoPessoa == "F" || tipoPessoa == "f") {

            } else if (tipoPessoa == "J" || tipoPessoa == "j") {

            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 4) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            String tipoPessoa = input.nextLine();
            if (tipoPessoa == "F" || tipoPessoa == "f") {

            } else if (tipoPessoa == "J" || tipoPessoa == "j") {

            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 5) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            String tipoPessoa = tipo.nextLine();
            if (Objects.equals(tipoPessoa, "F") || Objects.equals(tipoPessoa, "f")) {
                for (int i = 0; i < pf.size(); i++) {
                    System.out.println(Arrays.toString(pf.get(i)));
                }
            } else if (Objects.equals(tipoPessoa, "J") || Objects.equals(tipoPessoa,"j")) {
                for (int i = 0; i < pj.size(); i++) {
                    System.out.println(Arrays.toString(pj.get(i)));
                }
            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 6) {
            System.out.println("F - Pessoa Fisica | J - Pessoa Juridica");
            String tipoPessoa = input.nextLine();
            if (tipoPessoa == "F" || tipoPessoa == "f") {

            } else if (tipoPessoa == "J" || tipoPessoa == "j") {

            } else {
                System.out.println("Opção Inválida. Selecione novamente!");
            }
        } else if (opcao == 0) {
            System.exit(0);
        } else {
            System.out.println("Opção Inválida. Selecione novamente!");
        }
    }
}