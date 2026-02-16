package com.example.DeJSPaREST.controller;

import com.example.DeJSPaREST.model.Criterio;
import com.example.DeJSPaREST.service.CriterioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/criterios")
public class CriterioController {

    @Autowired
    private CriterioService criterioService;

    @GetMapping
    public List<Criterio> getAll() {
        return criterioService.getAll();
    }

    @PostMapping
    public Criterio create(@RequestBody Criterio criterio) {
        return criterioService.save(criterio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        criterioService.delete(id);
    }
}