package com.gestion.encuestas.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.encuestas.entities.Usuario;
import com.gestion.encuestas.services.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

     private final UsuarioService service;

    @GetMapping
    public List<Usuario> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return service.create(usuario);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
