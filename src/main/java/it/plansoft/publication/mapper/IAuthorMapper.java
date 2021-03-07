package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IAuthorMapper extends IMapper<AuthorDto, Author> {

//    AuthorDto toDto(Author model);
//
//    AuthorDto toDto(Optional<Author> model);
//
//    List<AuthorDto> toDtos(List<Author> models);
//
//    //Page<AuthorDto> toDtos(Page<Author> models);
//
//    Author dtoToModel(AuthorDto dto);
//
//    List<Author> DtosToModels(List<AuthorDto> dtos);
}
