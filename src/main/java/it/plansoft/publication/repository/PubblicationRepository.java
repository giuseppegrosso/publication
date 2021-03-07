package it.plansoft.publication.repository;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.repository */

import it.plansoft.publication.model.Pubblication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PubblicationRepository extends JpaRepository<Pubblication, Long> {

}
