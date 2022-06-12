package generic.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "description")
public class DescriptionEntity extends AbstractEntity {
    private String text;
    @ManyToMany(mappedBy = "descriptionSet")
    private Set<WarehouseEntity> warehouseSet;
}
