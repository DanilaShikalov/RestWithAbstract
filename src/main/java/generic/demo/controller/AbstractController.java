package generic.demo.controller;

import generic.demo.exception.EntityNotFoundException;
import generic.demo.models.*;
import generic.demo.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
public class AbstractController<Get extends AbstractGetDTO, Post extends AbstractPostDTO, Put extends AbstractPutDTO, Posted extends AbstractPostedDTO, Updated extends AbstractUpdatedDTO, S extends CommonService<Get, Post, Put, Posted, Updated>> implements CommonController<Get, Post, Put, Posted, Updated> {
    private final S service;

    @Override
    public List<Get> getAll() {
        return service.getAll();
    }

    @Override
    public Get getById(Long id) {
        try {
            return service.getById(id);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @Override
    public List<Posted> create(Post p) {
        return service.create(p);
    }

    @Override
    public Updated update(Long id, Put p) {
        try {
            return service.update(id, p);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @Override
    public List<Get> deleteById(Long id) {
        try {
            return service.deleteById(id);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @Override
    public List<Get> deleteAll() {
        return service.deleteAll();
    }
}
