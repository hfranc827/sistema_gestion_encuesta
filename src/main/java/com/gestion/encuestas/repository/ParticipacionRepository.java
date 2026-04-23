package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Participacion;

public interface ParticipacionRepository extends JpaRepository<Participacion,Long> {

}
