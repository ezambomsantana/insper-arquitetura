package com.insper.loja.compra;

import com.insper.loja.cliente.Cliente;
import com.insper.loja.pagamento.Pagamento;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Compra {

    private String id;
    private LocalDateTime dataCompra;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();

}
