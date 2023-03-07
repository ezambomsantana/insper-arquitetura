package com.insper.loja.produto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto salvarProduto(Produto produto) {
        produto.setIdentifier(UUID.randomUUID().toString());
        return produtoRepository.save(produto);
    }

    public Produto buscaProduto(String identifier) {
        return produtoRepository.findByIdentifier(identifier);
    }

}
