package com.web.busrefactoriapi.bean;

import javax.persistence.*;

@Entity
@Table
public class Reporte {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idreporte;
    @Column
    private String detalle;
    @Column
    private String hora;
    @Column
    private String piloto;
    @Column
    private String placabus;
    @Column
    private String sistema;
    @Column
    private String ubicacion;
    @Column
    private String velocidad;
    
    public Reporte() {
    }
    public long getIdReporte() {
        return idreporte;
    }
    public void setIdReporte(long idreporte) {
        this.idreporte = idreporte;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getPlacabus() {
        return placabus;
    }
    public void setPlacabus(String placabus) {
        this.placabus = placabus;
    }
    public String getSistema() {
        return sistema;
    }
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
}
