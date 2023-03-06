package com.insper.loja.pagamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Boleto extends Pagamento {
    private String codigoBarra;
    private LocalDateTime dataVencimento;
}
