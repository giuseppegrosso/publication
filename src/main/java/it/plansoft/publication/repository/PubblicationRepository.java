package it.plansoft.publication.repository;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.repository */

import it.plansoft.publication.model.Pubblication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PubblicationRepository extends JpaRepository<Pubblication, Long> {
    Set<Pubblication> findByAuthorsCognome(String cognome);

    Set<Pubblication> findByAuthorsId(Long id);


    @Query("select p from Publication p JOIN Author a WHERE a.cognome = :cognome")
    Pubblication findByAuthorsCustomCognome(@Param("cognome") String cognome);

    @Query("select p from Publication p JOIN Author a WHERE a.cognome = :cognome")
    Set<Pubblication> findByAuthorsCustomCognome2(@Param("cognome") String cognome);

    @Query("select p from Publication p WHERE p.titolo like %:titolo%")
    Set<Pubblication> findByTitolo(@Param("titolo") String titolo);


}
