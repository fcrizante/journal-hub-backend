package com.fcrizante.journalhub.backend.Repository;

import com.fcrizante.journalhub.backend.Model.Produto;
import org.springframework.data.repository.ListCrudRepository;

public interface ProdutoRepository extends ListCrudRepository<Produto,Integer> {
}
