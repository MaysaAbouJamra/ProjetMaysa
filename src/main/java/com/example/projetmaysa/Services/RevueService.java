package com.example.projetmaysa.Services;

import com.example.projetmaysa.Models.Revue;

import java.util.List;

public interface RevueService {
    public List<Revue> findAll();

    Revue save(Revue revue);
}
