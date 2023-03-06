package com.insper.loja.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private Integer parcelas;
}
