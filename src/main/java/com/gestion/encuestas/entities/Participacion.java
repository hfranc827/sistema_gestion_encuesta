package com.gestion.encuestas.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "participacion")
@Data
public class Participacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    //@ManyToOne
    //@JoinColumn(name = "usuario_id")
    //private Usuario usuario;

    //@ManyToOne
    //@JoinColumn(name = "encuesta_id")
    //private Encuesta encuesta;

}
