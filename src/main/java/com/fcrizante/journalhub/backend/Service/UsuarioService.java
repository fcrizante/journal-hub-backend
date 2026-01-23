package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Exception.NotFoundException;
import com.fcrizante.journalhub.backend.Model.Usuario;
import com.fcrizante.journalhub.backend.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {
    private UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public Usuario addUsuario(Usuario usr) {
        return repo.save(usr);
    }

    @Override
    public Usuario getUsuarioById(Integer id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Usuario: "+id+" não encontrado"));
    }

    @Override
    public List<Usuario> getUsuarios() {
        return repo.findAll();
    }
}
