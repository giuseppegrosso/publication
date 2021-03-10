package it.plansoft.publication.mapper;

import it.plansoft.publication.dto.BookDto;
import it.plansoft.publication.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IBookMapper extends IMapper<BookDto, Book> {

}
