package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Encuesta;

public interface EncuestaRepository extends JpaRepository<Encuesta,Long> {

}
