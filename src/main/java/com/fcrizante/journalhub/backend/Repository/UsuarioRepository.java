package com.fcrizante.journalhub.backend.Repository;

import com.fcrizante.journalhub.backend.Model.Usuario;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends ListCrudRepository<Usuario,Integer> {
    public Optional<Usuario> findByNome(String nome);
}
