package com.insper.loja.compra;

import com.insper.loja.cliente.Cliente;
import com.insper.loja.pagamento.Pagamento;
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

    @Column(name = "identifier", nullable = false, unique = true)
    private String identifier;

    private LocalDateTime dataCompra;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compra")
    private List<Item> itens = new ArrayList<>();

}
