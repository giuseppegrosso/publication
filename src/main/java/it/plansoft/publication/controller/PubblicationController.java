package it.plansoft.publication.controller;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.controller.interfaces */

import it.plansoft.publication.controller.interfaces.BaseCrudController;
import it.plansoft.publication.dto.PubblicationDto;
import it.plansoft.publication.model.Pubblication;
import it.plansoft.publication.repository.PubblicationRepository;
import it.plansoft.publication.service.PubblicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/pubblication")
public class PubblicationController extends BaseCrudController<PubblicationService, PubblicationRepository, Pubblication, Long> {

    public PubblicationController(PubblicationService service) {
        super(service);
    }

    @GetMapping("/authorId/{id}")
    public ResponseEntity<Set<PubblicationDto>> findByPubblicazioneId(@PathVariable Long id) {
        return ResponseEntity.ok(service.getPubblicationById(id));
    }

    @GetMapping("/authorTitle/{cognome}")
    public ResponseEntity<Set<PubblicationDto>> findByPubblicazioneId(@PathVariable String cognome) {
        return ResponseEntity.ok(service.getPubblicationByCognome2(cognome));
    }

    @GetMapping("/authorTitle2/{cognome}")
    public ResponseEntity<PubblicationDto> findByPubblicazione2Id(@PathVariable String cognome) {
        return ResponseEntity.ok(service.getPubblicationByCognome(cognome));
    }

    @GetMapping("/titolo/{titolo}")
    public ResponseEntity<Set<PubblicationDto>> findByTitolo(@PathVariable String titolo) {
        return ResponseEntity.ok(service.getPubblicationByTitolo(titolo));
    }
}
