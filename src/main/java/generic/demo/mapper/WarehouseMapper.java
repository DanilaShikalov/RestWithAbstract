package generic.demo.mapper;

import generic.demo.entities.WarehouseEntity;
import generic.demo.models.warehouse.*;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WarehouseMapper extends CommonMapper<WarehouseEntity, WarehouseGetDTO, WarehousePostDTO, WarehousePutDTO, WarehousePostedDTO, WarehouseUpdatedDTO> {
}
