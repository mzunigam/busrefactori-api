package com.web.busrefactoriapi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.busrefactoriapi.bean.Usuario;
import com.web.busrefactoriapi.services.UsuarioServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class RestFulAPI {
    
    @Autowired
    public UsuarioServices usuarioServices;

    @GetMapping("/usuario")
    public ResponseEntity<Usuario> getUsuario( @RequestParam("username") String username) {
        Optional<Usuario> usuario = usuarioServices.findByUsername(username);

        return ResponseEntity.ok(usuario.get());
        
    }


}
