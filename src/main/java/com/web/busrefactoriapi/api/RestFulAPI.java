package com.web.busrefactoriapi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.busrefactoriapi.bean.Usuario;
import com.web.busrefactoriapi.services.UsuarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class RestFulAPI {
    
    @Autowired
    public UsuarioServices usuarioServices;

    @GetMapping("/usuario")
    public String getUsuario() {

        Usuari

    }


}
