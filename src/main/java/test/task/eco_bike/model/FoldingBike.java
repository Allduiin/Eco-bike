package test.task.eco_bike.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import test.task.eco_bike.model.abstraction.Bike;

@Data
@Entity
public class FoldingBike extends Bike {
    @Id
    private Long id;
    @NotNull
    private Long sizeOfTheWheels;
    @NotNull
    private Long numberOfWheels;
}
