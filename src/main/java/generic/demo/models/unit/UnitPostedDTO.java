package generic.demo.models.unit;

import generic.demo.models.AbstractPostedDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnitPostedDTO extends AbstractPostedDTO {
    private String unit;
}
