package com.insper.loja.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.insper.loja.compra.Compra;
import com.insper.loja.compra.Item;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "identifier", nullable = false, unique = true)
    private String identifier;

    @NonNull
    @NotNull
    @NotEmpty
    @Column(name = "nome", nullable = false, unique = false)
    private String nome;
    @NonNull
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras = new ArrayList<>();

}
