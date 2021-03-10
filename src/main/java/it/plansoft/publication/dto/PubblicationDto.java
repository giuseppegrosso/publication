package it.plansoft.publication.dto;/* ggrosso created on 09/03/2021 inside the package - it.plansoft.publication2.dto */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PubblicationDto extends BaseDto<Long> {

    private Long id;
    private String titolo;
    private LocalDate dataPubblicazione;

//    private Set<AuthorDto> authors;
//    private Set<BookDto> books;
//    private Set<PostDto> posts;


}
