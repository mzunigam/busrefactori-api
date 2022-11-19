package com.web.busrefactoriapi.services;

import java.util.Optional;

import com.web.busrefactoriapi.bean.Usuario;

public interface UsuarioServices {

    public Optional<Usuario> findByUsername(String username);
    
}
