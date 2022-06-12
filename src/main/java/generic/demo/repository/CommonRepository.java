package generic.demo.repository;

import generic.demo.entities.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
