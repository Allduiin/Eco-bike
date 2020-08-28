package test.task.eco_bike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import test.task.eco_bike.model.abstraction.ElectricBike;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class EBike extends ElectricBike {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "EBike{" +
                "Id=" + id +
                "} " + super.toString();
    }
}
