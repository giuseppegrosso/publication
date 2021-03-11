package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.dto.PubblicationDto;
import it.plansoft.publication.model.Author;
import it.plansoft.publication.model.Pubblication;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface IPubblicationMapper extends IMapper<PubblicationDto, Pubblication> {
    IPubblicationMapper INSTANCE = Mappers.getMapper(IPubblicationMapper.class);
    Set<AuthorDto> authorToSetDtos(Set<Author> model);
}
