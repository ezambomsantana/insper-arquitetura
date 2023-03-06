package com.insper.loja.cliente;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String id;
    @NonNull
    @NotNull
    @NotEmpty
    private String nome;
    @NonNull
    private String cpf;

}
