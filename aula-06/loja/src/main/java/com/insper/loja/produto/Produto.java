package com.insper.loja.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private String id;
    private String nome;
    private Integer estoque;
    private Float preco;

}
