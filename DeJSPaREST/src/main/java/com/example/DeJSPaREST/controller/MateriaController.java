package com.example.DeJSPaREST.controller;

import com.example.DeJSPaREST.model.Materia;
import com.example.DeJSPaREST.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Importante: Indica que devolvemos datos JSON, no HTML
@RequestMapping("/api/materias") // La URL base será http://localhost:8080/api/materias
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getAll() {
        return materiaService.getAll();
    }

    @PostMapping
    public Materia create(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        materiaService.delete(id);
    }
    @PutMapping("/{id}")
public Materia update(@PathVariable Long id, @RequestBody Materia materia) {
    return materiaService.update(id, materia);
}
}