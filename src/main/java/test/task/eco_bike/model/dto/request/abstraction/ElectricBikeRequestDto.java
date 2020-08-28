package test.task.eco_bike.model.dto.request.abstraction;

import lombok.Data;

@Data
public abstract class ElectricBikeRequestDto extends BikeRequestDto {
    private Long maxSpeed;
    private Long BatteryCapacity;
}
