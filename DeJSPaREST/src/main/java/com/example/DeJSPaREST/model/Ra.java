package com.example.DeJSPaREST.model;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data
@Table(name = "resultados_aprendizaje")
public class Ra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Double ponderacion;

    // RELACIÓN IMPORTANTE: Muchos RAs pertenecen a una Materia
    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;
}