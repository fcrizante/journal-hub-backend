package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Exception.NotFoundException;
import com.fcrizante.journalhub.backend.Model.Fornecedor;
import com.fcrizante.journalhub.backend.Repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService implements IFornecedorService{
    private final FornecedorRepository repo;

    public FornecedorService(FornecedorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Fornecedor addNewFornecedor(Fornecedor f) {
        return repo.save(f);
    }

    @Override
    public Fornecedor getFornecedorById(Integer id) {
        return repo.findById(id).orElseThrow(()->new NotFoundException("Fornecedor não encontrado"));
    }

    @Override
    public List<Fornecedor> getFornecedores() {
        return repo.findAll();
    }
}
