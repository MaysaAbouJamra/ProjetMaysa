package com.example.projetmaysa.Controllers;

import com.example.projetmaysa.Models.Publication;
import com.example.projetmaysa.Models.Revue;
import com.example.projetmaysa.Services.PublicationService;
import com.example.projetmaysa.Services.RevueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("revues")
public class RevueController {
    private RevueService revueService;

    @Autowired
    public RevueController(RevueService revueService){
        this.revueService = revueService;
    }

    @GetMapping()
    public List<Revue> findAll() {
        return revueService.findAll();
    }

    @PostMapping
    public Revue save(@RequestBody Revue revue) {
        return revueService.save(revue);
    }




}
