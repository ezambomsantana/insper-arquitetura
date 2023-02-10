package org.example;


import org.example.conta.Conta;
import org.example.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Eduardo", "12345");
        Conta conta = new Conta(1000f, pessoa);

        conta.deposito(1000f);
        conta.saque(100f);

        System.out.println(conta.getPessoa().getNome());
        System.out.println(conta.getSaldo());
    }
}