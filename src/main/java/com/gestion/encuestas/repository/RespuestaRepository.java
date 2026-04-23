package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta,Long> {

}
