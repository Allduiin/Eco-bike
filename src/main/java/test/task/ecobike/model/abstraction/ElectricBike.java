package test.task.ecobike.model.abstraction;

import com.sun.istack.NotNull;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class ElectricBike extends Bike {
    @NotNull
    private Long maxSpeed;
    @NotNull
    private Long batteryCapacity;

    @Override
    public String toString() {
        return "ElectricBike{"
                + " maxSpeed=" + maxSpeed
                + ", batteryCapacity=" + batteryCapacity
                + "} " + super.toString();
    }
}
