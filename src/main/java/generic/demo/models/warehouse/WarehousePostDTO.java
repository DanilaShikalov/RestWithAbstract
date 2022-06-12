package generic.demo.models.warehouse;

import generic.demo.models.AbstractPostDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WarehousePostDTO extends AbstractPostDTO {
    private Long unitId;
    private String name;
    private Date date;
    private int price;
}
