package com.example.projet.repo;

import com.example.projet.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    public List<Livre> findAllByOrderByIdAsc();

    public Optional<Livre> findById(Long id);
}
