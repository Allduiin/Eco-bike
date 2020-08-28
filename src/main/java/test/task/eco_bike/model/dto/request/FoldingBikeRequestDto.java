package test.task.eco_bike.model.dto.request;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import test.task.eco_bike.model.dto.request.abstraction.BikeRequestDto;

@EqualsAndHashCode(callSuper = true)
@Data
public class FoldingBikeRequestDto extends BikeRequestDto {
    @NotNull
    private Long sizeOfTheWheels;
    @NotNull
    private Long numberOfGears;
}
