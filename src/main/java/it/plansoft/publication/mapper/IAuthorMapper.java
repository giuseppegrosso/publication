package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IAuthorMapper extends IMapper<AuthorDto, Author> {

    IAuthorMapper INSTANCE = Mappers.getMapper(IAuthorMapper.class);
}