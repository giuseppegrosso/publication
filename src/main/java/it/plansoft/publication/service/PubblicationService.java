package it.plansoft.publication.service;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.service.interfaces */

import it.plansoft.publication.dto.PubblicationDto;
import it.plansoft.publication.mapper.IPubblicationMapper;
import it.plansoft.publication.model.Pubblication;
import it.plansoft.publication.repository.PubblicationRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PubblicationService extends BaseCrudService<PubblicationRepository, Pubblication, Long> {
    public PubblicationService(PubblicationRepository repository) {
        super(repository);
    }

    public Set<PubblicationDto> getPubblicationById(Long id) {
        Set<Pubblication> pubblications = repository.findByAuthorsId(id);
        return IPubblicationMapper.INSTANCE.toSetDtos(pubblications);
    }

    public Set<PubblicationDto> getPubblicationByTitolo(String titolo) {
        Set<Pubblication> pubblications = repository.findByTitolo(titolo);
        return IPubblicationMapper.INSTANCE.toSetDtos(pubblications);
    }

    public PubblicationDto getPubblicationByCognome(String cognome) {
        Pubblication pubblications = repository.findByAuthorsCustomCognome(cognome);
//        Set<Pubblication> pubblications = repository.findByAuthorsCognome(cognome);
        return IPubblicationMapper.INSTANCE.toDto(pubblications);
    }

    public Set<PubblicationDto> getPubblicationByCognome2(String cognome) {
        Set<Pubblication> pubblications = repository.findByAuthorsCustomCognome2(cognome);
//        Set<Pubblication> pubblications = repository.findByAuthorsCognome(cognome);
        return IPubblicationMapper.INSTANCE.toSetDtos(pubblications);
    }

}
