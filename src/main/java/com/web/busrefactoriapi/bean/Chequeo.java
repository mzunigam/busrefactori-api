package com.web.busrefactoriapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Chequeo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idchequeo;
    private String estado,gas_antes,gas_despues,observacion,piloto,placabus,salon;
    
    public Chequeo() {
    }

    public long getIdchequeo() {
        return idchequeo;
    }

    public void setIdchequeo(long idchequeo) {
        this.idchequeo = idchequeo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGas_antes() {
        return gas_antes;
    }

    public void setGas_antes(String gas_antes) {
        this.gas_antes = gas_antes;
    }

    public String getGas_despues() {
        return gas_despues;
    }

    public void setGas_despues(String gas_despues) {
        this.gas_despues = gas_despues;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    
}
