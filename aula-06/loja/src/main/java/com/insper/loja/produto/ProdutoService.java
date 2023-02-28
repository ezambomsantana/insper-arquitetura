package com.insper.loja.produto;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto salvarProduto(Produto produto) {
        produto.setId(UUID.randomUUID().toString());
        produtos.add(produto);
        return produto;
    }

}
