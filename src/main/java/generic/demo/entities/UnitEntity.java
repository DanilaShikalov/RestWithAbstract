package generic.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "unit")
public class UnitEntity extends AbstractEntity {
    private String unit;
    @OneToMany(mappedBy = "unit")
    private List<WarehouseEntity> warehouseList;
}
