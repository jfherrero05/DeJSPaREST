package com.example.DeJSPaREST.service;

import com.example.DeJSPaREST.model.Criterio;
import com.example.DeJSPaREST.repository.CriterioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CriterioService {

    @Autowired
    private CriterioRepository criterioRepository;

    public List<Criterio> getAll() {
        return criterioRepository.findAll();
    }

    public Criterio save(Criterio criterio) {
        return criterioRepository.save(criterio);
    }

    public void delete(Long id) {
        criterioRepository.deleteById(id);
    }
}