package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Model.Produto;

import java.util.List;

public interface IProdutoService {
    public Produto addProduto(Produto p);
    public Produto getProdutoById(Integer id);
    public List<Produto> getProdutos();
}
