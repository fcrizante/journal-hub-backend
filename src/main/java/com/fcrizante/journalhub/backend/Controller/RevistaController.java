package com.fcrizante.journalhub.backend.Controller;

import com.fcrizante.journalhub.backend.Model.Revista;
import com.fcrizante.journalhub.backend.Service.IRevistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RevistaController {
    private final IRevistaService service;

    public RevistaController(IRevistaService service) {
        this.service = service;
    }

    @GetMapping("/revista")
    public ResponseEntity<List<Revista>> getRevista() {
        return ResponseEntity.ok(service.getRevistas());
    }

    @GetMapping("/revista/{id}")
    public ResponseEntity<Revista> getRevista(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getRevistaById(id));
    }

    @PostMapping("/revista")
    public ResponseEntity<Revista> addNewRevista(@RequestBody Revista r) {
        return ResponseEntity.ok(service.addNewRevista(r));
    }
}
