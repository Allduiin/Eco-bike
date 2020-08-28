package test.task.eco_bike.model.dto.response.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public abstract class ElectricBikeResponseDto extends BikeResponseDto {
    @NotNull
    private Long BatteryCapacity;
}
