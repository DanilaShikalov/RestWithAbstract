package generic.demo.service;

import generic.demo.models.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface CommonService<Get extends AbstractGetDTO, Post extends AbstractPostDTO, Put extends AbstractPutDTO, Posted extends AbstractPostedDTO, Updated extends AbstractUpdatedDTO> {
    List<Get> getAll();

    Get getById(Long id) throws EntityNotFoundException;

    List<Posted> create(Post p);

    Updated update(Long id, Put p) throws EntityNotFoundException;

    List<Get> deleteById(Long id) throws EntityNotFoundException;

    List<Get> deleteAll();
}
