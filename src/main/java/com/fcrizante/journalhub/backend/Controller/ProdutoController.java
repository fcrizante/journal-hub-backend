package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Produto;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
public class ProdutoController {
    private ArrayList<Produto> database;

    public ProdutoController(ArrayList<Produto> database) {
        this.database = new ArrayList<>() {{
            add(new Produto(1, "Veja", new BigDecimal("9.9")));
            add(new Produto(2, "Caras", new BigDecimal("9.9")));
            add(new Produto(3, "LM", new BigDecimal("7.5")));
            add(new Produto(4, "Isqueiro", new BigDecimal("4")));
            add(new Produto(5, "Jornal", new BigDecimal("7.9")));
        }};
    }

    //recuperando dados
    @GetMapping("/produto")
    public ResponseEntity<ArrayList<Produto>> getProduto() {
        return ResponseEntity.ok(database);
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable int id) {
        var prd = database.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        if (prd != null)
            return ResponseEntity.ok(prd);
        else
            return ResponseEntity.notFound().build();
    }

    //alteração de dados
    @PostMapping("/produto")
    public ResponseEntity<String> addProduto(@RequestBody Produto p) {
        database.add(p);
        return ResponseEntity.ok("Produto Incluido");
    }

    @PutMapping("/produto/{id}")
    public ResponseEntity<String> alterProduto(@PathVariable int id, @RequestBody Produto prd) {
        var pr = database.stream().filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        if (pr != null) {
            pr.setNome(prd.getNome());
            pr.setPreco(prd.getPreco());
            return ResponseEntity.ok("Produto alterado!!!!");
        } else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<String> delProduto(@PathVariable int id) {
        var pr = database.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        database.remove(pr);
        if (pr != null) {
            database.remove(pr);
            return ResponseEntity.ok("Produto excluido");
        } else
            return ResponseEntity.notFound().build();
    }

}
