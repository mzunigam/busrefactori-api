package com.web.busrefactoriapi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idusuario;
    @Column
    private String username;
    @Column
    private String password;
    
    public Usuario(Long idusuario, String username, String password) {
        this.idusuario = idusuario;
        this.username = username;
        this.password = password;
    }
    public Long getIdusuario() {
        return idusuario;
    }
    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    

}
