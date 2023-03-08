package com.insper.loja.compra;

import com.insper.loja.produto.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> listarCompras() {
        return compraService.listarCompras();
    }

    @PostMapping
    public Compra salvarCompra(@RequestBody @Valid Compra compra) {
        return compraService.salvarCompra(compra);
    }
}
