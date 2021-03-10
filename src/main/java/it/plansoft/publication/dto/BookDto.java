package it.plansoft.publication.dto;/* ggrosso created on 09/03/2021 inside the package - it.plansoft.publication.dto */

import it.plansoft.publication.model.BaseId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto extends BaseId<Long> {

    private Long id;
    private Integer pagine;
    private String copertina;
    private String argomento;
    private PubblicationDto bookpub;
}
