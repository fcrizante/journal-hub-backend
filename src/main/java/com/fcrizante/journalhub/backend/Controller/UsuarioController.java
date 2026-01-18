package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UsuarioController {
    private ArrayList<Usuario> database;

    public UsuarioController() {
        this.database = new ArrayList<>(){{
            add(new Usuario(1,"Felipe","felipe.crizante@gmail.com"));
            add(new Usuario(2,"Rebecca","meumozinho@gmail.com"));
            add(new Usuario(3,"sophia","sos@gmail.com"));
            add(new Usuario(4,"pedro","predo.enio@gmail.com"));
        }};
    }

    //recuperação de dados
    @GetMapping("/usuario")
    public ResponseEntity<ArrayList<Usuario>> getUsuarios(){
        return ResponseEntity.ok(database);
    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable int id){
        var usr = database.stream()
                .filter(u->u.getId() == id)
                .findFirst()
                .orElse(null);
        if(usr != null)
            return ResponseEntity.ok(usr);
        else
            return ResponseEntity.notFound().build();
    }

    //manipulação de dados
    @PostMapping("/usuario")
    public ResponseEntity<String> addNewUsuario(@RequestBody Usuario u){
        database.add(u);
        return ResponseEntity.ok("ok");
    }
    @PutMapping("/usuario/{id}")
    public ResponseEntity<String> updateUsuario(@PathVariable int id, @RequestBody Usuario usr){
        var user = database.stream()
                .filter(u->u.getId() == id)
                .findFirst()
                .orElse(null);
        if(user!=null){
            user.setEmail(usr.getEmail());
            user.setNome(usr.getNome());
            return ResponseEntity.ok("Usuário Alterado");
        }
        else
            return ResponseEntity.notFound().build();

    }
    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<String> delUsuario(@PathVariable int id){
        var user = database.stream()
                .filter(u->u.getId() == id)
                .findFirst()
                .orElse(null);
        if(user!=null){
            database.remove(user);
            return ResponseEntity.ok("Usuário removido");
        }
        else
            return ResponseEntity.notFound().build();
    }

}
