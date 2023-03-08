package com.insper.loja.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String identifier;
    @NonNull
    @NotNull
    @NotEmpty
    private String nome;
    @NonNull
    private String cpf;

}
