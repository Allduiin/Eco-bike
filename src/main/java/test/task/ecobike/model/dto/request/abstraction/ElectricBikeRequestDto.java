package test.task.ecobike.model.dto.request.abstraction;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ElectricBikeRequestDto extends BikeRequestDto {
    private Long maxSpeed;
    private Long batteryCapacity;
}
