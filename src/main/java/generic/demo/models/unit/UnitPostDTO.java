package generic.demo.models.unit;

import generic.demo.models.AbstractPostDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnitPostDTO extends AbstractPostDTO {
    private String unit;
}
