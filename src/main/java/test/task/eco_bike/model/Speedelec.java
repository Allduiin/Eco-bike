package test.task.eco_bike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import test.task.eco_bike.model.abstraction.ElectricBike;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Speedelec extends ElectricBike {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "Speedelec{" +
                "id=" + id +
                "} " + super.toString();
    }
}
