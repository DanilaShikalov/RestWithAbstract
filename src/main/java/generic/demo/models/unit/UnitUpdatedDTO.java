package generic.demo.models.unit;

import generic.demo.models.AbstractUpdatedDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnitUpdatedDTO extends AbstractUpdatedDTO {
    private String unit;
}
