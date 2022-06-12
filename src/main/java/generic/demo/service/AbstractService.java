package generic.demo.service;

import generic.demo.entities.AbstractEntity;
import generic.demo.exception.EntityNotFoundException;
import generic.demo.mapper.CommonMapper;
import generic.demo.models.*;
import generic.demo.repository.CommonRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>, Get extends AbstractGetDTO, Post extends AbstractPostDTO, Put extends AbstractPutDTO, Posted extends AbstractPostedDTO, Updated extends AbstractUpdatedDTO, M extends CommonMapper<E, Get, Post, Put, Posted, Updated>> implements CommonService<Get, Post, Put, Posted, Updated>{
    protected final R repository;
    protected final M mapper;

    @Override
    public List<Get> getAll() {
        return repository.findAll().stream().map(mapper::entityToGetDTO).collect(Collectors.toList());
    }

    @Override
    public Get getById(Long id) throws generic.demo.exception.EntityNotFoundException {
        return mapper.entityToGetDTO(repository.findById(id).orElseThrow(() -> new generic.demo.exception.EntityNotFoundException(id)));
    }

    @Override
    public List<Posted> create(Post p) {
        repository.save(mapper.postDTOToEntity(p));
        return repository.findAll().stream().map(mapper::entityToPostedDTO).collect(Collectors.toList());
    }

    @Override
    public Updated update(Long id, Put p) throws generic.demo.exception.EntityNotFoundException {
        if(!repository.existsById(id))
            throw new generic.demo.exception.EntityNotFoundException(id);
        E e = mapper.putDTOToEntity(p);
        e.setId(id);
        repository.save(e);
        return mapper.entityToUpdatedDTO(repository.findById(id).orElse(null));
    }

    @Override
    public List<Get> deleteById(Long id) throws generic.demo.exception.EntityNotFoundException {
        if(!repository.existsById(id))
            throw new EntityNotFoundException(id);
        repository.deleteById(id);
        return mapper.listEntityToListGetDTO(repository.findAll());
    }

    @Override
    public List<Get> deleteAll() {
        repository.deleteAll();
        return mapper.listEntityToListGetDTO(repository.findAll());
    }
}
