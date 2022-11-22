package com.web.busrefactoriapi.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.busrefactoriapi.bean.Reporte;
import com.web.busrefactoriapi.repository.ReporteRepository;
import com.web.busrefactoriapi.services.ReporteServices;

@Service
public class ReporteImpl implements ReporteServices {

    @Autowired
    private ReporteRepository reporteRepository;

    @Override
    public void guardarReporte(Reporte reporte) {
        reporteRepository.save(reporte);
    }

    
}
