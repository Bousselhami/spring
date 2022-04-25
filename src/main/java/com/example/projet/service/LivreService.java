package com.example.projet.service;

import com.example.projet.entities.Livre;
import com.example.projet.repo.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivre() {
        return livreRepository.findAllByOrderByIdAsc();
    }

    public Livre getLivreById(Long id) {
        return livreRepository.findById(id).get();
    }
}
