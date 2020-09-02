package test.task.ecobike.model.abstraction;

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
    private Boolean availabilityOfLights;
    @NotNull
    private Long weight;
}
