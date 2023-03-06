package com.insper.loja.produto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "identifier", nullable = false, unique = true)
    private String identifier;
    @NonNull
    @NotNull
    @NotEmpty
    private String nome;
    @NonNull
    private Integer estoque;
    @NonNull
    private Float preco;

}
