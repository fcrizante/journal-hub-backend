package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Model.Produto;
import com.fcrizante.journalhub.backend.Model.Revista;

import java.util.List;

public interface IRevistaService {
    public Revista addNewRevista(Revista r);
    public Revista getRevistaById(Integer id);
    public List<Revista> getRevistas();

}
