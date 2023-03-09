package com.insper.loja.compra;

import com.insper.loja.cliente.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String identifier;
    private LocalDateTime dataCompra;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
   // private List<Item> itens = new ArrayList<>();

}
