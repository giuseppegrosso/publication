package it.plansoft.publication.model;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.model */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Book")
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book extends BaseId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pagine")
    private Integer pagine;

    @Column(name = "copertina")
    private String copertina;

    @Column(name = "argomento")
    private String argomento;

    @ManyToOne
    @JoinColumn( name="publication_id" )
    private Pubblication bookpub;
}
