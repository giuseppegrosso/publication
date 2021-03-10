package it.plansoft.publication.dto;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.dto */

import it.plansoft.publication.model.BaseId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto extends BaseId<Long> {

    private Long id;
    private String nome;
    private String cognome;
    private PubblicationDto pubblication;

}
