package br.com.conta.api.conta;


import br.com.conta.api.pessoa.Pessoa;

public class ContaCorrente extends Conta {

    private Float limite;

    public ContaCorrente() {}

    public ContaCorrente(Float saldo, Pessoa pessoa, Float limite) {
        super(saldo, pessoa);
        this.limite = limite;
    }

    public ContaCorrente(Conta conta, Float limite) {
        super(conta.getSaldo(), conta.getPessoa());
        this.limite = limite;
    }

    @Override
    public void saque(Float valor) {

        if (this.getSaldo() + limite < valor) {
            System.out.println("Saque inválido");
        } else {
            this.saldo -= valor;
        }

    }

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }

}
