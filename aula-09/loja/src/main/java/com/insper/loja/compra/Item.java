package com.insper.loja.compra;

import com.insper.loja.produto.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    private Float preco;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    private Compra compra;

}
