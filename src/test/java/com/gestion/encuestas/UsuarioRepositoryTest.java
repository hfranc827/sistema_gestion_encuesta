package com.gestion.encuestas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gestion.encuestas.entities.Usuario;
import com.gestion.encuestas.repository.UsuarioRepository;

@SpringBootTest
public class UsuarioRepositoryTest {
      @Autowired
    private UsuarioRepository repository;

    @Test
    void testGuardarUsuario() {
        Usuario u = new Usuario();
        u.setUsername("test");
        u.setEmail("test@gmail.com");
        u.setPassword("123");

        Usuario saved = repository.save(u);

        assertNotNull(saved.getId());
    }

}
