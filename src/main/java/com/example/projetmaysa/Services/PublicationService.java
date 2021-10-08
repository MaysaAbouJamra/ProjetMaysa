package com.example.projetmaysa.Services;

import com.example.projetmaysa.Models.Publication;

import java.util.List;
import java.util.Optional;

public interface PublicationService {

    public List<Publication> findAll();

    Publication save(Publication publication);

    Optional<Publication> findById(Integer id);

    Publication update(Publication superHero);

    void delete(Integer id);

    public List<Publication> findByAnnee(String annee); //ou pour revue pour nom

}
