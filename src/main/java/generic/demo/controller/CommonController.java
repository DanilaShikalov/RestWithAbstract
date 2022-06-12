package generic.demo.controller;

import generic.demo.entities.AbstractEntity;
import generic.demo.models.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController<Get extends AbstractGetDTO, Post extends AbstractPostDTO, Put extends AbstractPutDTO, Posted extends AbstractPostedDTO, Updated extends AbstractUpdatedDTO> {
    @GetMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    List<Get> getAll();

    @GetMapping("/{id}")
    Get getById(@PathVariable Long id);

    @PostMapping("/")
    List<Posted> create(@RequestBody Post p);

    @PutMapping("/{id}")
    Updated update(@PathVariable Long id, @RequestBody Put p);

    @DeleteMapping("/{id}")
    List<Get> deleteById(@PathVariable Long id);

    @DeleteMapping("/")
    List<Get> deleteAll();
}
