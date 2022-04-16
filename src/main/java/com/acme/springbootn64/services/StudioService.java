package com.acme.springbootn64.services;

import com.acme.springbootn64.entities.Studio;
import com.acme.springbootn64.repositories.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudioService {
    @Autowired
    private StudioRepository studioRepository;

    public List<Studio> findAll() {
        return studioRepository.findAll();
    }

    public Optional<Studio> findById(Long id) {
        return studioRepository.findById(id);
    }
}
