package br.com.conta.api.conta;

import br.com.conta.api.pessoa.Pessoa;
import br.com.conta.api.pessoa.PessoaController;
import br.com.conta.api.pessoa.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    private ContaService contaService = ContaService.getInstance();

    @GetMapping
    public List<Conta> getContas() {
        return contaService.listar();
    }

    @PostMapping
    public Conta salvarConta(@RequestBody ContaCorrente contaCorrente) {
        return contaService.cadastrar(contaCorrente);
    }

}
