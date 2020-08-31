package test.task.ecobike.model.dto.response.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ElectricBikeResponseDto extends BikeResponseDto {
    @NotNull
    private Long batteryCapacity;
}
