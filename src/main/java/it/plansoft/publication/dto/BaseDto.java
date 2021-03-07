package it.plansoft.publication.dto;/* ggrosso created on 07/03/2021 inside the package - it.plansoft.publication.dto */

import it.plansoft.publication.model.BaseId;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BaseDto<ID> extends BaseId<ID> {

    protected ID id;

}
