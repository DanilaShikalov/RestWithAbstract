package generic.demo.service;

import generic.demo.entities.UnitEntity;
import generic.demo.mapper.UnitMapper;
import generic.demo.models.unit.*;
import generic.demo.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UnitService extends AbstractService<UnitEntity, UnitRepository, UnitGetDTO, UnitPostDTO, UnitPutDTO, UnitPostedDTO, UnitUpdatedDTO, UnitMapper>{
    public UnitService(UnitRepository repository, @Qualifier("unitMapperImpl") UnitMapper mapper) {
        super(repository, mapper);
    }
}
