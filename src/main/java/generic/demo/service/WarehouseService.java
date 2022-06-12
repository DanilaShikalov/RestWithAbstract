package generic.demo.service;

import generic.demo.entities.WarehouseEntity;
import generic.demo.exception.EntityNotFoundException;
import generic.demo.mapper.WarehouseMapper;
import generic.demo.models.warehouse.*;
import generic.demo.repository.UnitRepository;
import generic.demo.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseService extends AbstractService<WarehouseEntity, WarehouseRepository, WarehouseGetDTO, WarehousePostDTO, WarehousePutDTO, WarehousePostedDTO, WarehouseUpdatedDTO, WarehouseMapper>{
    private final UnitRepository unitRepository;

    @Autowired
    public WarehouseService(WarehouseRepository repository, @Qualifier("warehouseMapperImpl") WarehouseMapper mapper, UnitRepository unitRepository) {
        super(repository, mapper);
        this.unitRepository = unitRepository;
    }

    @Override
    public List<WarehousePostedDTO> create(WarehousePostDTO warehousePostDTO) {
        WarehouseEntity warehouseEntity = mapper.postDTOToEntity(warehousePostDTO);
        warehouseEntity.setUnit(unitRepository.getById(warehousePostDTO.getUnitId()));
        repository.save(warehouseEntity);
        List<WarehouseEntity> warehouseEntities = repository.findAll();
        return warehouseEntities.stream().map(mapper::entityToPostedDTO).collect(Collectors.toList());
    }

    @Override
    public WarehouseUpdatedDTO update(Long id, WarehousePutDTO warehousePutDTO) throws EntityNotFoundException {
        if (!repository.existsById(id))
        {
            throw new EntityNotFoundException(id);
        }
        WarehouseEntity warehouseEntity = mapper.putDTOToEntity(warehousePutDTO);
        warehouseEntity.setUnit(unitRepository.getById(warehousePutDTO.getUnitId()));
        warehouseEntity.setId(id);
        repository.save(warehouseEntity);
        return mapper.entityToUpdatedDTO(repository.getById(id));
    }
}
