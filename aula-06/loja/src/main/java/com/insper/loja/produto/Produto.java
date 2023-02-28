package com.insper.loja.produto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Produto {

    private String id;
    @NonNull
    private String nome;
    @NonNull
    private Integer estoque;
    @NonNull
    private Float preco;

}
