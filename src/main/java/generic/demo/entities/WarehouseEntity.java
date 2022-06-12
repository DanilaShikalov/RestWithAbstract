package generic.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@Data
@Table(name = "warehouse")
@NoArgsConstructor
public class WarehouseEntity extends AbstractEntity {
    private String name;
    private Date date;
    private int price;
    @ManyToOne
    private UnitEntity unit;
    @OneToOne(mappedBy = "warehouse")
    private UniqueDescriptionEntity uniqueDescription;
    @ManyToMany
    private List<DescriptionEntity> descriptionSet;
}
