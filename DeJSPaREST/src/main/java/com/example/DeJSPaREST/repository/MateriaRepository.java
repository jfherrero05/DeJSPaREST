package com.example.DeJSPaREST.repository;

import com.example.DeJSPaREST.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
    // ¡Listo! No hace falta escribir nada más por ahora.
    // Spring Data JPA crea el código por ti mágicamente.
}