package com.example.projet.controller;

import com.example.projet.entities.Livre;
import com.example.projet.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreController {
    @Autowired
    private LivreService livreService;

    @GetMapping("/listLivres")
    public List<Livre> getAllLivre() {
        return livreService.getAllLivre();
    }

    @GetMapping("/livre/{id}")
    public Livre getLivreById(@PathVariable("id") Long id) {
        return livreService.getLivreById(id);
    }
}
