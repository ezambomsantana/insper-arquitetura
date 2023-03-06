package com.insper.loja.produto;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaProdutos() {
        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody @Valid Produto produto) {
        return produtoService.salvarProduto(produto);
    }


}
