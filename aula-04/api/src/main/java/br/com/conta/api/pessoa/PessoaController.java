package br.com.conta.api.pessoa;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private List<Pessoa> pessoas = new ArrayList<>();

    @GetMapping
    public List<Pessoa> getPessoas(@RequestParam(name = "idade", required = false) Integer idade) {
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

    @GetMapping("/{id}")
    public Pessoa getPessoa(@PathVariable Integer id) {
        return pessoas.get(id);
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pessoa salvarPessoa(@RequestBody @Valid Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
    }

}
