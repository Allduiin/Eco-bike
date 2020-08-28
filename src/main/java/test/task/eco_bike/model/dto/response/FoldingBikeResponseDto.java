package test.task.eco_bike.model.dto.response;

import com.sun.istack.NotNull;
import lombok.Data;
import test.task.eco_bike.model.dto.response.abstraction.BikeResponseDto;

@Data
public class FoldingBikeResponseDto extends BikeResponseDto {
    @NotNull
    private Long numberOfWheels;
}
