package it.plansoft.publication.service;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.service.interfaces */

import it.plansoft.publication.model.Book;
import it.plansoft.publication.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseCrudService<BookRepository, Book, Long> {
    public BookService(BookRepository repository) {
        super(repository);
    }



}
