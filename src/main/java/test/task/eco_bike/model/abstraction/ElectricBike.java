package test.task.eco_bike.model.abstraction;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ElectricBike extends Bike {
    @NotNull
    private Long maxSpeed;
    @NotNull
    private Long BatteryCapacity;

    @Override
    public String toString() {
        return "ElectricBike{" +
                "maxSpeed=" + maxSpeed +
                ", BatteryCapacity=" + BatteryCapacity +
                "} " + super.toString();
    }
}
