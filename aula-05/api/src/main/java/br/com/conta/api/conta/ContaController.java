package br.com.conta.api.conta;

import br.com.conta.api.pessoa.Pessoa;
import br.com.conta.api.pessoa.PessoaController;
import br.com.conta.api.pessoa.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    private PessoaService pessoaService = PessoaService.getInstance();

    @GetMapping
    private List<Pessoa> getContas() {
        return pessoaService.getPessoas(null);
    }

}
