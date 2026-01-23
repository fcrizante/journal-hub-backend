package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Usuario;
import com.fcrizante.journalhub.backend.Service.IUsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final IUsuarioService service;

    public UsuarioController(IUsuarioService service) {
        this.service = service;
    }

    //recuperação de dados
    @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>> getUsuarios() {
        return ResponseEntity.ok(service.getUsuarios());
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable int id) {
        return ResponseEntity.ok(service.getUsuarioById(id));
    }

    //manipulação de dados
    @PostMapping("/usuario")
    public ResponseEntity<Usuario> addNewUsuario(@RequestBody Usuario u) {
        return ResponseEntity.ok(service.addUsuario(u));
    }
}
