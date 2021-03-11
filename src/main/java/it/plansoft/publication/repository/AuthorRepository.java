package it.plansoft.publication.repository;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.repository */

import it.plansoft.publication.model.Author;
import it.plansoft.publication.model.Book;
import it.plansoft.publication.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Set<Author> findByPublicationTitolo(String publicationTitolo);
    Set<Author> findByPublicationId(Long publicationId);
}
