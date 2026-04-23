package com.gestion.encuestas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pregunta")
@Data
@NoArgsConstructor
public class Pregunta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private String tipo;
    private Integer orden;

    //@ManyToOne
    //@JoinColumn(name = "encuesta_id")
    //private Encuesta encuesta;




}
