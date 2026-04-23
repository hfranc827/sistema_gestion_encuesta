package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Pregunta;

public interface PrenguntaRepository extends JpaRepository<Pregunta,Long> {

}
