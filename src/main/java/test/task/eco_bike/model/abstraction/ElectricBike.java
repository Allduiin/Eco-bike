package test.task.eco_bike.model.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public abstract class ElectricBike extends Bike {
    @NotNull
    private Long maxSpeed;
    @NotNull
    private Long BatteryCapacity;
}
