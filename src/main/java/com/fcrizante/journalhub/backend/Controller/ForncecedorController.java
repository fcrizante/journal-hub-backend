package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Fornecedor;
import com.fcrizante.journalhub.backend.Service.IFornecedorService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ForncecedorController {
    private final IFornecedorService service;

    public ForncecedorController(IFornecedorService service) {
        this.service = service;
    }

    @GetMapping("/fornecedor")
    public ResponseEntity<List<Fornecedor>> getFornecedores() {
        return ResponseEntity.ok(service.getFornecedores());
    }

    @GetMapping("/fonecedor/{id}")
    public ResponseEntity<Fornecedor> getFornecedorById(@PathVariable Integer id){
        return ResponseEntity.ok(service.getFornecedorById(id));
    }
    @PostMapping("/fonecedor")
    public ResponseEntity<Fornecedor> addNewFornecedor(@RequestBody Fornecedor f){
        return ResponseEntity.ok(service.addNewFornecedor(f));
    }
}
