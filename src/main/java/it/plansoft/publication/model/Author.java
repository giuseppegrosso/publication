package it.plansoft.publication.model;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.model */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Author")
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author extends BaseId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publication_id")
    private Pubblication publication;

    public Pubblication getPublication() {
        return publication;
    }

    public void setPublication(Pubblication publication) {
        this.publication = publication;
    }
}
