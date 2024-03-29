package com.insper.loja.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByIdentifier(String identifier);

    boolean existsByIdentifier(String identifier);

    void deleteByCliente(Cliente cliente);

    Cliente findByNomeOrCpf(String nome, String cpf);
}
