package com.web.busrefactoriapi.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.busrefactoriapi.bean.Usuario;
import com.web.busrefactoriapi.repository.UsuarioRepository;
import com.web.busrefactoriapi.services.UsuarioServices;

@Service
public class UsuarioImpl  implements UsuarioServices {

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> findByUsername(String username) {
        Usuario usuario =   usuarioRepository.findByUsername(username);

        return Optional.of(usuario);
    }

}
