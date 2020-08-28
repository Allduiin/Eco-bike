package test.task.eco_bike.model.dto.response.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public abstract class BikeResponseDto {
    @NotNull
    private String brand;
    @NotNull
    private Long price;
    @NotNull
    private boolean availabilityOfLights;
}
