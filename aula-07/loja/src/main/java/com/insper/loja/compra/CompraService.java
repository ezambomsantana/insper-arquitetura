package com.insper.loja.compra;

import com.insper.loja.produto.Produto;
import com.insper.loja.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CompraService {

    private List<Compra> compras = new ArrayList<>();

    @Autowired
    private ProdutoService produtoService;

    public List<Compra> listarCompras() {
        return compras;
    }

    public Compra salvarCompra(Compra compra) {

        for (Item item : compra.getItens()) {
            Produto produto = produtoService
                    .buscaProduto(item.getProduto().getId());
            if (produto == null) {
                return null;
            }
        }
        compra.setId(UUID.randomUUID().toString());
        compras.add(compra);
        return compra;
    }

}
