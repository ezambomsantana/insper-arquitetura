package br.com.conta.api.pessoa;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    public final static PessoaService pessoaService = PessoaService.getInstance();

    @GetMapping
    public List<Pessoa> getPessoas(@RequestParam(name = "idade", required = false) Integer idade) {
        return pessoaService.getPessoas(idade);
    }

    @GetMapping("/{id}")
    public Pessoa getPessoa(@PathVariable Integer id) {
        return pessoaService.getPessoa(id);
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pessoa salvarPessoa(@RequestBody @Valid Pessoa pessoa) {
        return pessoaService.salvarPessoa(pessoa);
    }

}
