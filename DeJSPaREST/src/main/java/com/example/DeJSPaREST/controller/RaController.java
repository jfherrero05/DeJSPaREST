package com.example.DeJSPaREST.controller;

import com.example.DeJSPaREST.model.Ra;
import com.example.DeJSPaREST.service.RaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ras")
public class RaController {

    @Autowired
    private RaService raService;

    @GetMapping
    public List<Ra> getAll() {
        return raService.getAll();
    }

    @PostMapping
    public Ra create(@RequestBody Ra ra) {
        // Al enviar el JSON, deberás indicar el ID de la materia
        return raService.save(ra);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        raService.delete(id);
    }
}