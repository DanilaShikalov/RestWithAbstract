package generic.demo.mapper;

import generic.demo.entities.UnitEntity;
import generic.demo.models.unit.*;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UnitMapper extends CommonMapper<UnitEntity, UnitGetDTO, UnitPostDTO, UnitPutDTO, UnitPostedDTO, UnitUpdatedDTO> {
}
