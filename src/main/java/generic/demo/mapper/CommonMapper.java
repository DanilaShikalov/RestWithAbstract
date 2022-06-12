package generic.demo.mapper;

import generic.demo.entities.AbstractEntity;
import generic.demo.models.*;

import java.util.List;

public interface CommonMapper<E extends AbstractEntity, Get extends AbstractGetDTO, Post extends AbstractPostDTO, Put extends AbstractPutDTO, Posted extends AbstractPostedDTO, Updated extends AbstractUpdatedDTO> {
    E postDTOToEntity(Post post);
    E putDTOToEntity(Put put);
    Get entityToGetDTO(E e);
    Posted entityToPostedDTO(E e);
    Updated entityToUpdatedDTO(E e);
    List<Get> listEntityToListGetDTO(List<E> e);
}
