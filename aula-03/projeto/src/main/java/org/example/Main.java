package org.example;


import org.example.conta.Conta;
import org.example.conta.ContaCorrente;
import org.example.conta.ContaService;
import org.example.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContaService contaService = new ContaService();
        String operacao = "";

        Scanner scanner = new Scanner(System.in);

       // Console console = System.console();
       // console.readLine("DIgite o nome: ");
        while (!operacao.equals("4")) {
            System.out.println("1 - Criar \n2 - Listar\n3 - Buscar\n 4 - Sair");
            operacao = scanner.next();

            if (operacao.equals("1")) {
                String nome = scanner.next();
                String cpf = scanner.next();
                Float saldo = scanner.nextFloat();
                Float limite = scanner.nextFloat();

                contaService.cadastrar(nome, cpf, saldo, limite);

            }

            if (operacao.equals("2")) {
                for (Conta c : contaService.listar()) {
                    System.out.println(c);
                }
            }

            if (operacao.equals("3")) {
                String cpf = scanner.next();
                Conta conta = contaService.buscar(cpf);

                if (conta != null) {
                    System.out.println(conta);
                } else {
                    System.out.println("Conta nao encontrada");
                }
            }

        }

    }


}