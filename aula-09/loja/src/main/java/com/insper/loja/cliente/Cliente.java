package com.insper.loja.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.insper.loja.compra.Compra;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
