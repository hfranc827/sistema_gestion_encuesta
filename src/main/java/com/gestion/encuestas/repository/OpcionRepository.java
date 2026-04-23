package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Opcion;

public interface OpcionRepository extends JpaRepository<Opcion,Long> {

}
