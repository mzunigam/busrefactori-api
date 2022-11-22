package com.web.busrefactoriapi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.busrefactoriapi.bean.Chequeo;
import com.web.busrefactoriapi.bean.Reporte;
import com.web.busrefactoriapi.bean.Usuario;
import com.web.busrefactoriapi.repository.ChequeoRepository;
import com.web.busrefactoriapi.services.ChequeoServices;
import com.web.busrefactoriapi.services.ReporteServices;
import com.web.busrefactoriapi.services.UsuarioServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class RestFulAPI {
    
    @Autowired
    public UsuarioServices usuarioServices;
    @Autowired
    public ReporteServices reporteServices;
    @Autowired
    public ChequeoServices chequeoServices;

    @GetMapping("/usuario/find")
    public ResponseEntity<Usuario> getUsers( @RequestParam("username") String username) {
        Optional<Usuario> usuario = usuarioServices.findByUsername(username);
        return ResponseEntity.ok(usuario.get());
    }

    @PostMapping("/reporte/save")
    public void saveReporte( @RequestBody Reporte body) {
        reporteServices.guardarReporte(body);
    }

    @PostMapping("/chequeo/save")
    public void saveChequeo( @RequestBody Chequeo body) {
        chequeoServices.guardarChequeo(body);
    }


}
