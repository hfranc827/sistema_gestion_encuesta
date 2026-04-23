package com.gestion.encuestas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gestion.encuestas.entities.Rol;
import com.gestion.encuestas.repository.RolRepository;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RolController {

    private final RolRepository repository;

    @GetMapping
    public List<Rol> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Rol getById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Rol no encontrado"));
    }

    @PostMapping
    public Rol create(@RequestBody Rol rol) {
        return repository.save(rol);
    }

    @PutMapping("/{id}")
    public Rol update(@PathVariable Long id, @RequestBody Rol rol) {
        Rol r = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Rol no encontrado"));

        r.setNombre(rol.getNombre());
        return repository.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
