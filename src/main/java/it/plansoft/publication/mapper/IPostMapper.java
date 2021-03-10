package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.AuthorDto;
import it.plansoft.publication.dto.PostDto;
import it.plansoft.publication.model.Author;
import it.plansoft.publication.model.Post;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface IPostMapper extends IMapper<PostDto, Post> {

}
