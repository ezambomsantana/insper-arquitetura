package org.example.conta;

import org.example.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ContaService {

    private List<Conta> contas = new ArrayList<>();

    public void cadastrar(String nome, String cpf, Float saldo, Float limite) {
        Pessoa p = new Pessoa(nome, cpf);
        Conta conta = new ContaCorrente(saldo, p, limite);

        contas.add(conta);
    }

    public List<Conta> listar() {
        return contas;
    }

    public Conta buscar(String cpf) {
        Conta conta = null;
        for (Conta c : contas) {
            if (c.getPessoa().getCpf().equals(cpf)) {
                conta = c;
                break;
            }
        }
        return conta;
    }

}
