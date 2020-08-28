package test.task.eco_bike.model.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public abstract class Bike {
    @NotNull
    private String brand;
    @NotNull
    private Long price;
    @NotNull
    private String color;
    @NotNull
    private boolean availabilityOfLights;
    @NotNull
    private Long weight;
}
