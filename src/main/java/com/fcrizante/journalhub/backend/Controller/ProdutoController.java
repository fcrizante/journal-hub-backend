package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Produto;
import com.fcrizante.journalhub.backend.Service.IProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {
    private final IProdutoService service;

    public ProdutoController(IProdutoService service) {
        this.service = service;
    }

    //recuperando dados
    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> getProduto() {
        return ResponseEntity.ok(service.getProdutos());
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getProdutoById(id));
    }

    //alteração de dados
    @PostMapping("/produto")
    public ResponseEntity<Produto> addProduto(@RequestBody Produto p) {
        return ResponseEntity.ok(service.addProduto(p));
    }
}
