package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Exception.NotFoundException;
import com.fcrizante.journalhub.backend.Model.Revista;
import com.fcrizante.journalhub.backend.Repository.RevistaRepository;
import com.fcrizante.journalhub.backend.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RevistaService implements IRevistaService {
    private final RevistaRepository repoRevista;
    private final ProdutoRepository repoProduto;

    public RevistaService(RevistaRepository repo, ProdutoRepository repoP) {
        this.repoRevista = repo;
        this.repoProduto = repoP;
    }

    @Override
    public Revista addNewRevista(Revista r) {
        return repoRevista.save(r);
    }

    @Override
    public Revista getRevistaById(Integer id) {
        return repoRevista.findById(id).orElseThrow(() -> new NotFoundException("Revista não encontrada"));
    }

    @Override
    public List<Revista> getRevistas() {
        return repoRevista.findAll();
    }
}
