package com.insper.loja.compra;

import com.insper.loja.cliente.Cliente;
import com.insper.loja.cliente.ClienteService;
import com.insper.loja.produto.Produto;
import com.insper.loja.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ClienteService clienteService;

    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    public Compra salvarCompra(Compra compra) {
        for (Item item : compra.getItens()) {
            Produto produto = produtoService.buscaProduto(item.getProduto().getIdentifier());
            item.setProduto(produto);
            item.setPreco(produto.getPreco());
        }
        Cliente cliente = clienteService.buscaCliente(compra.getCliente().getIdentifier());
        compra.setCliente(cliente);

        compra.setDataCompra(LocalDateTime.now());
        compra.setIdentifier(UUID.randomUUID().toString());
        return compraRepository.save(compra);
    }

}
