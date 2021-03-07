package it.plansoft.publication.controller;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.controller.interfaces */

import it.plansoft.publication.controller.interfaces.BaseCrudController;
import it.plansoft.publication.model.Book;
import it.plansoft.publication.repository.BookRepository;
import it.plansoft.publication.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController extends BaseCrudController<BookService, BookRepository, Book, Long> {

    public BookController(BookService service) {
        super(service);
    }

}
