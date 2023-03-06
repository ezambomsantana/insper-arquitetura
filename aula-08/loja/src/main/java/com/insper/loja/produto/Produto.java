package com.insper.loja.produto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Produto {

    private String id;
    @NonNull
    @NotNull
    @NotEmpty
    private String nome;
    @NonNull
    private Integer estoque;
    @NonNull
    private Float preco;

}
