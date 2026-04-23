package com.gestion.encuestas.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "encuesta")
@Data
@NoArgsConstructor
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descripcion;
    private String estado;;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    //@ManyToOne
    //@JoinColumn(name = "usuario_id")
    //private Usuario usuario;
}
