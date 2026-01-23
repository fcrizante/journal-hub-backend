package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Exception.NotFoundException;
import com.fcrizante.journalhub.backend.Model.Produto;
import com.fcrizante.journalhub.backend.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService{
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }

    @Override
    public Produto addProduto(Produto p) {
        return repo.save(p);
    }

    @Override
    public Produto getProdutoById(Integer id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Produto não localizado"));
    }

    @Override
    public List<Produto> getProdutos() {
        return repo.findAll();
    }
}
