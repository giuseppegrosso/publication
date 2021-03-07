package it.plansoft.publication.mapper;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.mapper */

import java.util.List;
import java.util.Optional;

public interface IMapper<DTO, MODEL> {

    DTO toDto(MODEL model);

    DTO toDto(Optional<MODEL> model);

    List<DTO> toDtos(List<MODEL> models);

    //Page<DTO> toDtos(Page<MODEL> models);

    MODEL dtoToModel(DTO dto);

    List<MODEL> DtosToModels(List<DTO> dtos);
}
