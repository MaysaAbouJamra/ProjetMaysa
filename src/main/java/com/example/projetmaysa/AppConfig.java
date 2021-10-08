package com.example.projetmaysa;

import com.example.projetmaysa.Repositories.PublicationRepository;
import com.example.projetmaysa.Repositories.RevueRepository;
import com.example.projetmaysa.Services.PublicationService;
import com.example.projetmaysa.Services.PublicationServiceImpl;
import com.example.projetmaysa.Services.RevueService;
import com.example.projetmaysa.Services.RevueServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PublicationService publicationService(PublicationRepository publicationRepository){
        return new PublicationServiceImpl(publicationRepository);
    }

    @Bean
    public RevueService revueService(RevueRepository revueRepository){
        return new RevueServiceImpl(revueRepository);
    }
}
