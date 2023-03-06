package com.insper.loja.compra;

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
    private List<Item> itens = new ArrayList<>();


}
