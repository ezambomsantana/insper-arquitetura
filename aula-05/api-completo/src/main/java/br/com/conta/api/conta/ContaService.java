package br.com.conta.api.conta;

import br.com.conta.api.pessoa.Pessoa;
import br.com.conta.api.pessoa.PessoaService;

import java.util.ArrayList;
import java.util.List;

public class ContaService {

    private static ContaService contaService = null;

    private ContaService() {}

    public static ContaService getInstance() {
        if (contaService == null) {
            contaService = new ContaService();
        }
        return contaService;
    }

    private List<Conta> contas = new ArrayList<>();

    private PessoaService pessoaService = PessoaService.getInstance();

    public Conta cadastrar(ContaCorrente contaCorrente) {

        Pessoa p = pessoaService.getPessoa(contaCorrente.getPessoa().getCpf());
        Conta conta = new ContaCorrente(contaCorrente.getSaldo(), p, contaCorrente.getLimite());

        contas.add(conta);
        return conta;
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
