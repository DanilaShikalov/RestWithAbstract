package generic.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "uniquedes")
public class UniqueDescriptionEntity extends AbstractEntity {
    @OneToOne
    @MapsId
    private WarehouseEntity warehouse;
}
