package com.example.DeJSPaREST.repository;

import com.example.DeJSPaREST.model.Criterio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriterioRepository extends JpaRepository<Criterio, Long> {
}