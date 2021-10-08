package com.example.projetmaysa.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Revue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRevue", nullable = false)
    private Integer idRevue;

    @Column(name = "nom")
    private String nom;

    @Column(name = "periodicite")
    private Integer periodicite;

    //Une revue a un id de la publication
    @ManyToOne(optional = true)
    @JoinColumn(name = "PUBLICATION_idNumero", referencedColumnName="idNumero")
    private Publication publication;


}
