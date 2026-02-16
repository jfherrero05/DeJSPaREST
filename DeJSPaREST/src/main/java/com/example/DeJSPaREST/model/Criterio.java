package com.example.DeJSPaREST.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "criterios")
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;      // Ej: "a)", "1.1"
    private String descripcion; // Ej: "Instala el entorno de desarrollo..."

    // RELACIÓN: Muchos Criterios pertenecen a un RA
    @ManyToOne
    @JoinColumn(name = "ra_id", nullable = false)
    private Ra ra;
}