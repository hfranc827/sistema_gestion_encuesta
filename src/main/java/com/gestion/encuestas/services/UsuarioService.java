package com.gestion.encuestas.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gestion.encuestas.entities.Usuario;
import com.gestion.encuestas.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Long id, Usuario usuario) {
        Usuario u = findById(id);
        u.setUsername(usuario.getUsername());
        u.setEmail(usuario.getEmail());
        return repository.save(u);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
