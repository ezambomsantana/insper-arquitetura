package com.insper.loja.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository
        extends JpaRepository<Produto, Integer> {

    Produto findByIdentifier(String identifier);

}
