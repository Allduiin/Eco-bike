package test.task.eco_bike.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import test.task.eco_bike.model.abstraction.ElectricBike;

@Data
@Entity
public class EBike extends ElectricBike {
    @Id
    private Long Id;
}
