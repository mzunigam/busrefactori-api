package com.web.busrefactoriapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.web.busrefactoriapi.bean.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
