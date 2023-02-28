package com.insper.loja.produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

    @GetMapping
    public List<Produto> listaProdutos() {
        return produtoService.listarProdutos();
    }
}
