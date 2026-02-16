package com.example.DeJSPaREST.model; // Asegúrate de que este paquete coincida con tu carpeta

import jakarta.persistence.*;
import lombok.Data; 

@Entity
@Data // Esto crea automáticamente los Getters, Setters y toString
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String curso; 
    private Integer horas;
}