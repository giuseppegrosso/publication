package it.plansoft.publication.model;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.model */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "Pubblication")
@Table(name = "pubblication")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pubblication extends BaseId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_pubblicazione")
    private Date dataPubblicazione;

    @OneToMany(cascade= CascadeType.ALL, mappedBy="publication")
    private Set<Author> authors;

    @OneToMany(cascade= CascadeType.ALL, mappedBy="postpub")
    private Set<Post> posts;

    @OneToMany(cascade= CascadeType.ALL, mappedBy="bookpub")
    private Set<Book> books;

}
