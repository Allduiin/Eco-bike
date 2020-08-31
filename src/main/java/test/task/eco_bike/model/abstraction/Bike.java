package test.task.eco_bike.model.abstraction;

import com.sun.istack.NotNull;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
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
