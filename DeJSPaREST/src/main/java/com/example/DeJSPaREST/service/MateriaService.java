package com.example.DeJSPaREST.service;

import com.example.DeJSPaREST.model.Materia;
import com.example.DeJSPaREST.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    // Obtener todas las materias
    public List<Materia> getAll() {
        return materiaRepository.findAll();
    }

    // Guardar una materia
    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    // Borrar una materia
    public void delete(Long id) {
        materiaRepository.deleteById(id);
    }
    
    // Buscar por ID
    public Optional<Materia> getById(Long id) {
        return materiaRepository.findById(id);
    }
    public Materia update(Long id, Materia materiaActualizada) {
    return materiaRepository.findById(id)
        .map(materia -> {
            materia.setNombre(materiaActualizada.getNombre());
            materia.setCurso(materiaActualizada.getCurso());
            materia.setHoras(materiaActualizada.getHoras());
            return materiaRepository.save(materia);
        }).orElseThrow(() -> new RuntimeException("Materia no encontrada"));
}
}