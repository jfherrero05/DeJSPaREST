package com.example.DeJSPaREST.service;

import com.example.DeJSPaREST.model.Ra;
import com.example.DeJSPaREST.repository.RaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RaService {

    @Autowired
    private RaRepository raRepository;

    public List<Ra> getAll() {
        return raRepository.findAll();
    }

    public Ra save(Ra ra) {
        return raRepository.save(ra);
    }

    public void delete(Long id) {
        raRepository.deleteById(id);
    }
}