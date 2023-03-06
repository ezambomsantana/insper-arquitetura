package com.insper.loja.pagamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Pix {
    private String qrCode;
    private LocalDateTime dataVencimento;
}
