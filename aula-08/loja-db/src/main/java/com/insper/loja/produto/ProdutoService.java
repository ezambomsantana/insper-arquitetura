package com.insper.loja.produto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository productRepository;

    public List<Produto> listarProdutos() {
        return productRepository.findAll();
    }

    public Produto salvarProduto(Produto produto) {
        produto.setIdentifier(UUID.randomUUID().toString());
        productRepository.save(produto);
        return produto;
    }

    public Produto buscaProduto(String id) {
        return productRepository.findByIdentifier(id);
    }

}
