package com.example.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Livre implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String titre;
    @Column(updatable = false)
    private String maison_edition;
    private Date date_sortie;
    private String acteur;
    private Long nb_pages;
    @Column(unique = true, updatable = false)
    private String ISBN;
    private Date date_consultation;
    private boolean is_dispo;
}
