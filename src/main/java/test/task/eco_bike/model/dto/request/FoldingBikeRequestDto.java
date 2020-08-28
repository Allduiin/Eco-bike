package test.task.eco_bike.model.dto.request;

import com.sun.istack.NotNull;
import test.task.eco_bike.model.dto.request.abstraction.BikeRequestDto;

public class FoldingBikeRequestDto extends BikeRequestDto {
    @NotNull
    private Long sizeOfTheWheels;
    @NotNull
    private Long numberOfWheels;
}
