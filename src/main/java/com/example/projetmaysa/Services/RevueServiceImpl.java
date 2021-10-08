package com.example.projetmaysa.Services;

import com.example.projetmaysa.Models.Revue;
import com.example.projetmaysa.Repositories.PublicationRepository;
import com.example.projetmaysa.Repositories.RevueRepository;

import java.util.List;

public class RevueServiceImpl implements RevueService{

    private RevueRepository revueRepository;

    public RevueServiceImpl(RevueRepository revueRepository) {
        this.revueRepository = revueRepository;
    }
    @Override
    public List<Revue> findAll() {
        return this.revueRepository.findAll();
    }

    @Override
    public Revue save(Revue revue) {
        return this.revueRepository.save(revue);
    }
}
