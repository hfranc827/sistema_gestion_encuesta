package com.gestion.encuestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.encuestas.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
