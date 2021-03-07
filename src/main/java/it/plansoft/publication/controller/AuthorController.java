package it.plansoft.publication.controller;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.controller.interfaces */

import it.plansoft.publication.controller.interfaces.BaseCrudDtoController;
import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.mapper.IAuthorMapper;
import it.plansoft.publication.model.Author;
import it.plansoft.publication.repository.AuthorRepository;
import it.plansoft.publication.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController extends BaseCrudDtoController<
        AuthorService,
        AuthorRepository,
        IAuthorMapper,
        AuthorDto,
        Author,
        Long> {

    public AuthorController(AuthorService service) {
        super(service);
    }

}
