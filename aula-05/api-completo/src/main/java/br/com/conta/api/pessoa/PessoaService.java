package br.com.conta.api.pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private static PessoaService pessoaService = null;

    private PessoaService() {}

    public static PessoaService getInstance() {
        if (pessoaService == null) {
            pessoaService = new PessoaService();
        }
        return pessoaService;
    }

    private final List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas(Integer idade) {

        if (idade != null) {
            List<Pessoa> pFiltradas = new ArrayList<>();
            for (Pessoa p : pessoas) {
                if (p.getIdade().equals(idade)) {
                    pFiltradas.add(p);
                }
            }
            return pFiltradas;
        }
        return pessoas;
    }

    public Pessoa getPessoa(Integer id) {
        return pessoas.get(id);
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
    }


    public Pessoa getPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }
}
