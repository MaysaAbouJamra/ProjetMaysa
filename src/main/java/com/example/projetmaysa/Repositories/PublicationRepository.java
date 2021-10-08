package com.example.projetmaysa.Repositories;

import com.example.projetmaysa.Models.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Integer> {

    //retourner les publication qui sont faites dans une certiane annee

    @Query("SELECT Publication FROM Publication p where p.annee=?1")
    List<Publication> findByAnnee(String annee);

}
