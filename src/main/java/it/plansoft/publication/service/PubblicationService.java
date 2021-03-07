package it.plansoft.publication.service;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.service.interfaces */

import it.plansoft.publication.model.Pubblication;
import it.plansoft.publication.repository.PubblicationRepository;
import org.springframework.stereotype.Service;

@Service
public class PubblicationService extends BaseCrudService<PubblicationRepository, Pubblication, Long> {
    public PubblicationService(PubblicationRepository repository) {
        super(repository);
    }

}
