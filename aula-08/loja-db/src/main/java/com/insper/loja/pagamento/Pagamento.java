package com.insper.loja.pagamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Pagamento {
    private Float valor;
    private LocalDateTime dataPagamento;
}
