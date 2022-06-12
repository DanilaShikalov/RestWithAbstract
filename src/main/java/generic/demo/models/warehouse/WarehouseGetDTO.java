package generic.demo.models.warehouse;

import generic.demo.models.AbstractGetDTO;
import generic.demo.models.unit.UnitGetDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WarehouseGetDTO extends AbstractGetDTO {
    private String name;
    private Date date;
    private int price;

    private UnitGetDTO unit;
}
