package it.plansoft.publication.service;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.service.interfaces */

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.mapper.IAuthorMapper;
import it.plansoft.publication.model.Author;
import it.plansoft.publication.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService extends BaseCrudDtoService<
        AuthorRepository,
        IAuthorMapper,
        AuthorDto, Author, Long> {


    @Autowired
    public AuthorService(AuthorRepository repository, IAuthorMapper mapper) {
        super(repository, mapper);
    }

}
