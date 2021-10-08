package com.example.projetmaysa.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idNumero", nullable = false)
    private Integer idNumero;

    @Column(name = "annee")
    private String annee;

    @Column(name = "nbPages")
    private Integer nbPages;

    //Une publication peut avoir 1 ou plusieur revues
    @OneToMany(cascade = CascadeType.ALL)
    private List<Revue> revues; //peut avoir 1 to many revues

}
