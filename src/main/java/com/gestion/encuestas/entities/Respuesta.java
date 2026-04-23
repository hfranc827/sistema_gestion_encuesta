package com.gestion.encuestas.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "respuesta")
@Data
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    private String contenido;

    //@ManyToOne
    //@JoinColumn(name = "usuario_id")
    //private Usuario usuario;

    //@ManyToOne
    //@JoinColumn(name = "pregunta_id")
    //private Pregunta pregunta;

    //@ManyToOne
    //@JoinColumn(name = "opcion_id")
    //private Opcion opcion;

}
