package generic.demo.models.unit;

import generic.demo.models.AbstractGetDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnitGetDTO extends AbstractGetDTO {
    private String unit;
}
