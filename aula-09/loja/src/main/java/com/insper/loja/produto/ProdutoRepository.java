package com.insper.loja.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository
        extends JpaRepository<Produto, Integer> {

    Produto findByIdentifier(String identifier);

    List<Produto> findByPrecoGreaterThan(Float preco);

}
