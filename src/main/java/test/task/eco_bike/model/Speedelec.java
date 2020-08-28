package test.task.eco_bike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import test.task.eco_bike.model.abstraction.ElectricBike;

@Data
@Entity
public class Speedelec extends ElectricBike {
    @Id
    private Long id;
}
