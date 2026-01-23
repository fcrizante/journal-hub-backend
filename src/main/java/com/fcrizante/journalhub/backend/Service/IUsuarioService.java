package com.fcrizante.journalhub.backend.Service;

import com.fcrizante.journalhub.backend.Model.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario addUsuario(Usuario usr);
    public Usuario getUsuarioById(Integer id);
    public List<Usuario> getUsuarios();
}
