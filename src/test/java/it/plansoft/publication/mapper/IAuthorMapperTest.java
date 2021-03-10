package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.model.Author;
import it.plansoft.publication.model.Pubblication;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IAuthorMapperTest {
    private IAuthorMapper mapper = Mappers.getMapper(IAuthorMapper.class);
    @Test
    public void testEntityToModel() {
        Author entity = new Author();
        entity.setCognome("X");
        entity.setNome("John");
        entity.setId(1L);

        Pubblication pub = new Pubblication();
        pub.setDataPubblicazione(LocalDate.now());
        pub.setTitolo("prova");
        entity.setPublication(pub);

        AuthorDto model = mapper.toDto(entity);

        assertEquals(entity.getCognome(), model.getCognome());
        assertEquals(entity.getNome(), model.getNome());
        assertEquals(entity.getId(), model.getId());
        assertEquals(entity.getPublication().getTitolo(), model.getPubblication().getTitolo());
    }
}