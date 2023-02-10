package org.example.conta;

import org.example.pessoa.Pessoa;

public class ContaCorrente extends Conta {

    private Float limite;

    public ContaCorrente(Float saldo, Pessoa pessoa, Float limite) {
        super(saldo, pessoa);
        this.limite = limite;
    }
}
