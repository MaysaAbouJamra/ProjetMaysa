package com.example.projetmaysa.Controllers;

import com.example.projetmaysa.Models.Publication;
import com.example.projetmaysa.Services.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("publications")
public class PublicationController {

    private PublicationService publicationService;

    @Autowired
    public PublicationController(PublicationService publicationService){
        this.publicationService = publicationService;
    }

    @GetMapping()
    public List<Publication> findAll() {
        return publicationService.findAll();
    }

    @GetMapping("/{idNumero}")
    public Optional<Publication> findById(@PathVariable Integer idNumero) {
        return publicationService.findById(idNumero);
    }

    //Retourner les publications realisés dans une certaine annee
    @GetMapping("/publicationyear/{annee}")
    public List<Publication> findByAnnee(@PathVariable String annee) {
        return publicationService.findByAnnee(annee);
    }

    @PostMapping
    public Publication save(@RequestBody Publication publication) {
        return publicationService.save(publication);
    }

    @PutMapping()
    public Publication update(@RequestBody Publication publication){
        return this.publicationService.update(publication);
    }

    @DeleteMapping("/{idNumero}")
    public void delete(@PathVariable  Integer idNumero) {
        publicationService.delete(idNumero);
    }




}


