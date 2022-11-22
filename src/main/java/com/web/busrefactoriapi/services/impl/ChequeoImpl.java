package com.web.busrefactoriapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.busrefactoriapi.bean.Chequeo;
import com.web.busrefactoriapi.repository.ChequeoRepository;
import com.web.busrefactoriapi.services.ChequeoServices;

@Service
public class ChequeoImpl implements ChequeoServices {

    @Autowired
    private ChequeoRepository chequeoRepository;

    @Override
    public void guardarChequeo(Chequeo chequeo) {
        chequeoRepository.save(chequeo);
    }

}
    