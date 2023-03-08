package com.insper.loja.compra;

import com.insper.loja.produto.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Produto produto;
    private Float preco;

}
