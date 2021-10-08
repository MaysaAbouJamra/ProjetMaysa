package com.example.projetmaysa.Services;

import com.example.projetmaysa.Models.Publication;
import com.example.projetmaysa.Repositories.PublicationRepository;

import java.util.List;
import java.util.Optional;

public class PublicationServiceImpl implements PublicationService{

    private PublicationRepository publicationRepository;

    public PublicationServiceImpl(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }
    @Override
    public List<Publication> findAll() {
        return this.publicationRepository.findAll();
    }

    @Override
    public Publication save(Publication publication) {
        return this.publicationRepository.save(publication);
    }

    @Override
    public Optional<Publication> findById(Integer idNumero) {
        return this.publicationRepository.findById(idNumero);
    }

    @Override
    public Publication update(Publication publication) {
        return this.publicationRepository.save(publication);
    }

    @Override
    public void delete(Integer id) {
        this.publicationRepository.deleteById(id);
    }


    public List<Publication> findByAnnee(String annee) {
        return this.publicationRepository.findByAnnee(annee);
    }


}
