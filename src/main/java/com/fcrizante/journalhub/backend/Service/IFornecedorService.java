package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Model.Fornecedor;

import java.util.List;

public interface IFornecedorService {
    public Fornecedor addNewFornecedor(Fornecedor f);
    public Fornecedor getFornecedorById(Integer id);
    public List<Fornecedor> getFornecedores();
}
