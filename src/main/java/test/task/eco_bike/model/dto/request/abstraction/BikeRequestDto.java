package test.task.eco_bike.model.dto.request.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public abstract class BikeRequestDto {
    @NotNull
    private String brand;
    private Long price;
    private String color;
    private boolean availabilityOfLights;
    private Long weight;
}
