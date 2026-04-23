package com.gestion.encuestas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gestion.encuestas.entities.Usuario;
import com.gestion.encuestas.services.UsuarioService;


@SpringBootTest
public class UsuarioServiceTest {


    @Autowired
    private UsuarioService service;

    @Test
    void testCrearUsuario() {
        Usuario u = new Usuario();
        u.setUsername("juan");
        u.setEmail("juan@gmail.com");
        u.setPassword("123");

        Usuario saved = service.create(u);

        assertNotNull(saved.getId());
    }

}
