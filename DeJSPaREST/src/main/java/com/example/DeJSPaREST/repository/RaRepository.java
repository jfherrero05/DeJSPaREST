package com.example.DeJSPaREST.repository;

import com.example.DeJSPaREST.model.Ra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaRepository extends JpaRepository<Ra, Long> {
    // Aquí podríamos añadir métodos extra si quisiéramos, 
    // por ejemplo: List<Ra> findByMateriaId(Long materiaId);
}